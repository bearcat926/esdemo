package hao.es;

/**
 * Created by hao hao on 2019/8/15 0015.
 */
import cn.hutool.core.util.StrUtil;
        import cn.hutool.core.util.XmlUtil;
        import org.dom4j.Document;
        import org.dom4j.DocumentException;
        import org.dom4j.Node;
        import org.dom4j.io.SAXReader;
        import org.xml.sax.InputSource;

        import java.util.List;

public class CcXmlUtil {

    public static String getConferenceIdByNumber(String xmlStr,String number){
        //判断xmlStr是否为空
        if (StrUtil.isBlank(xmlStr)) {
            throw new IllegalArgumentException("XML content string is empty !");
        }
        //将由xmlStr转换成的Input，使用dom4j
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(new InputSource(StrUtil.getReader(XmlUtil.cleanInvalid(xmlStr))));
        } catch (DocumentException e) {
            //转换失败返回null，避免程序向下执行报错
            e.printStackTrace();
            return null;
        }
        //xPath语法 //* 表示选取文档中的所有元素，即返回文档中所有Node组成的List
        List<Node> list = document.selectNodes("//*");

        //开始匹配的标志
        boolean flag = false;
        for (Node n : list) {
            //若flag = true，则可以开始寻找节点ConferenceId，匹配则返回ConferenceId的对应值
            if(flag && n.getName().equals("ConferenceId")){
                return n.getText();
            }
            //如果节点Number的值为给定参数，则将flag置为true
            if(n.getName().equals("Number") && n.getText().equals(number)){
                flag = true;
            }
        }
        return null;
    }

}
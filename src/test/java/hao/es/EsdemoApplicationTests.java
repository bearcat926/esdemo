package hao.es;

import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.xml.sax.InputSource;

import java.util.List;
import cn.hutool.core.util.StrUtil;
import cn.hutool.core.util.XmlUtil;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

import java.util.List;

@SpringBootTest
public class EsdemoApplicationTests {


	/**
	 * Created by hao hao on 2019/8/15 0015.
	 */


	@Test
	public void test(){

		String xmlStr = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
				"\n" +
				"<MCU_XML_API>\n" +
				"  <Version>8.3</Version>\n" +
				"  <Response>\n" +
				"    <Get_Conference_Response>\n" +
				"      <RequestID>111</RequestID>\n" +
				"      <ReturnValue>OK</ReturnValue>\n" +
				"      <Conference>\n" +
				"        <UserId>10</UserId>\n" +
				"        <UserFirstName>dev</UserFirstName>\n" +
				"        <UserLastName>dev</UserLastName>\n" +
				"        <Number>1234</Number>\n" +
				"        <AccessPIN/>\n" +
				"        <ServiceTemplateId>10001</ServiceTemplateId>\n" +
				"        <ServicePrefix>71</ServicePrefix>\n" +
				"        <Priority>DELAY</Priority>\n" +
				"        <AllowStreaming>OFF</AllowStreaming>\n" +
				"        <StreamingStatus>UNDEFINED</StreamingStatus>\n" +
				"        <Attendee>\n" +
				"          <ThreeG>false</ThreeG>\n" +
				"          <VoiceOnly>false</VoiceOnly>\n" +
				"          <DialIn>false</DialIn>\n" +
				"          <NeedOnMaster>false</NeedOnMaster>\n" +
				"          <UserId>10</UserId>\n" +
				"          <Email>dev@dc.com</Email>\n" +
				"          <FirstName>dev</FirstName>\n" +
				"          <LastName>dev</LastName>\n" +
				"          <Host>true</Host>\n" +
				"          <Organizer>true</Organizer>\n" +
				"          <Panelist>false</Panelist>\n" +
				"        </Attendee>\n" +
				"        <Attendee>\n" +
				"          <MemberId>999</MemberId>\n" +
				"          <TerminalId>1-PARTY-10001</TerminalId>\n" +
				"          <TerminalName>XT4000-BA6</TerminalName>\n" +
				"          <Protocol>H323</Protocol>\n" +
				"          <TerminalNumber>3000</TerminalNumber>\n" +
				"          <MaxBandwidth>2048</MaxBandwidth>\n" +
				"          <ThreeG>false</ThreeG>\n" +
				"          <VideoProfile>AUTO</VideoProfile>\n" +
				"          <VoiceOnly>false</VoiceOnly>\n" +
				"          <RegisterGKId>1-GK-10001</RegisterGKId>\n" +
				"          <LocationId>0001</LocationId>\n" +
				"          <AddressBookEnabled>true</AddressBookEnabled>\n" +
				"          <DialIn>false</DialIn>\n" +
				"          <NeedOnMaster>false</NeedOnMaster>\n" +
				"          <UserId>8</UserId>\n" +
				"          <Email>labtest@dcgavaya.cn</Email>\n" +
				"          <FirstName/>\n" +
				"          <LastName>lab</LastName>\n" +
				"          <Host>false</Host>\n" +
				"          <Organizer>false</Organizer>\n" +
				"          <Panelist>false</Panelist>\n" +
				"        </Attendee>\n" +
				"        <ReservedPorts>\n" +
				"          <SD>0</SD>\n" +
				"          <HD>0</HD>\n" +
				"          <FullHD>0</FullHD>\n" +
				"          <AudioOnlyWC>1</AudioOnlyWC>\n" +
				"        </ReservedPorts>\n" +
				"        <BlockDialIn>false</BlockDialIn>\n" +
				"        <AutoExtend>true</AutoExtend>\n" +
				"        <WaitingRoom>false</WaitingRoom>\n" +
				"        <AdvancedProperties>\n" +
				"          <EnableMCUCascading>false</EnableMCUCascading>\n" +
				"          <AllowDynamicGrow>false</AllowDynamicGrow>\n" +
				"          <DurationAfterLeft>P0Y0M0DT0H1M0.000S</DurationAfterLeft>\n" +
				"          <AlertDurationBeforeTermination>P0Y0M0DT0H0M0.000S</AlertDurationBeforeTermination>\n" +
				"          <TerminationCondition>AFTER_ALL_PARTIES_LEFT</TerminationCondition>\n" +
				"          <MaxParticipants>250</MaxParticipants>\n" +
				"          <MaxRoomParticipants>250</MaxRoomParticipants>\n" +
				"        </AdvancedProperties>\n" +
				"        <OneTimePINRequired>false</OneTimePINRequired>\n" +
				"        <Layout>\n" +
				"          <LayoutName>Main</LayoutName>\n" +
				"          <LayoutType>0000</LayoutType>\n" +
				"          <Dynamic>true</Dynamic>\n" +
				"          <NoSelfSee>true</NoSelfSee>\n" +
				"        </Layout>\n" +
				"        <Layout>\n" +
				"          <LayoutName>Customer</LayoutName>\n" +
				"          <LayoutType>0000</LayoutType>\n" +
				"          <Dynamic>false</Dynamic>\n" +
				"          <NoSelfSee>true</NoSelfSee>\n" +
				"        </Layout>\n" +
				"        <ConferenceId>1031</ConferenceId>\n" +
				"        <Status>FINISHED</Status>\n" +
				"        <Subject>dev's vr</Subject>\n" +
				"        <Description/>\n" +
				"        <StartTime>2019-08-13T14:37:51.872+08:00</StartTime>\n" +
				"        <EarlyTime>2019-08-13T14:22:51.872+08:00</EarlyTime>\n" +
				"        <EventConference>false</EventConference>\n" +
				"        <PlannedEndTime>2019-08-13T15:07:51.811+08:00</PlannedEndTime>\n" +
				"        <Duration>P0Y0M0DT23H43M0.000S</Duration>\n" +
				"        <LocationId>0001</LocationId>\n" +
				"        <SendingNotification>false</SendingNotification>\n" +
				"        <RecordingMeetingWhenStart>false</RecordingMeetingWhenStart>\n" +
				"        <ReccurencePatternChanged>false</ReccurencePatternChanged>\n" +
				"        <RecipentsChanged>false</RecipentsChanged>\n" +
				"        <AddRecipents>false</AddRecipents>\n" +
				"        <RemovePersonalTerminals>false</RemovePersonalTerminals>\n" +
				"        <CheckTerminalConflicts>false</CheckTerminalConflicts>\n" +
				"        <CSRSetting>\n" +
				"          <Public>false</Public>\n" +
				"          <QandAEnabled>false</QandAEnabled>\n" +
				"          <AccessModeSetting/>\n" +
				"        </CSRSetting>\n" +
				"      </Conference>\n" +
				"\t    <Conference>\n" +
				"        <UserId>10</UserId>\n" +
				"        <UserFirstName>dev</UserFirstName>\n" +
				"        <UserLastName>dev</UserLastName>\n" +
				"        <Number>1235</Number>\n" +
				"        <AccessPIN/>\n" +
				"        <ServiceTemplateId>10001</ServiceTemplateId>\n" +
				"        <ServicePrefix>71</ServicePrefix>\n" +
				"        <Priority>DELAY</Priority>\n" +
				"        <AllowStreaming>OFF</AllowStreaming>\n" +
				"        <StreamingStatus>UNDEFINED</StreamingStatus>\n" +
				"        <Attendee>\n" +
				"          <ThreeG>false</ThreeG>\n" +
				"          <VoiceOnly>false</VoiceOnly>\n" +
				"          <DialIn>false</DialIn>\n" +
				"          <NeedOnMaster>false</NeedOnMaster>\n" +
				"          <UserId>10</UserId>\n" +
				"          <Email>dev@dc.com</Email>\n" +
				"          <FirstName>dev</FirstName>\n" +
				"          <LastName>dev</LastName>\n" +
				"          <Host>true</Host>\n" +
				"          <Organizer>true</Organizer>\n" +
				"          <Panelist>false</Panelist>\n" +
				"        </Attendee>\n" +
				"        <Attendee>\n" +
				"          <MemberId>999</MemberId>\n" +
				"          <TerminalId>1-PARTY-10001</TerminalId>\n" +
				"          <TerminalName>XT4000-BA6</TerminalName>\n" +
				"          <Protocol>H323</Protocol>\n" +
				"          <TerminalNumber>3000</TerminalNumber>\n" +
				"          <MaxBandwidth>2048</MaxBandwidth>\n" +
				"          <ThreeG>false</ThreeG>\n" +
				"          <VideoProfile>AUTO</VideoProfile>\n" +
				"          <VoiceOnly>false</VoiceOnly>\n" +
				"          <RegisterGKId>1-GK-10001</RegisterGKId>\n" +
				"          <LocationId>0001</LocationId>\n" +
				"          <AddressBookEnabled>true</AddressBookEnabled>\n" +
				"          <DialIn>false</DialIn>\n" +
				"          <NeedOnMaster>false</NeedOnMaster>\n" +
				"          <UserId>8</UserId>\n" +
				"          <Email>labtest@dcgavaya.cn</Email>\n" +
				"          <FirstName/>\n" +
				"          <LastName>lab</LastName>\n" +
				"          <Host>false</Host>\n" +
				"          <Organizer>false</Organizer>\n" +
				"          <Panelist>false</Panelist>\n" +
				"        </Attendee>\n" +
				"        <ReservedPorts>\n" +
				"          <SD>0</SD>\n" +
				"          <HD>0</HD>\n" +
				"          <FullHD>0</FullHD>\n" +
				"          <AudioOnlyWC>1</AudioOnlyWC>\n" +
				"        </ReservedPorts>\n" +
				"        <BlockDialIn>false</BlockDialIn>\n" +
				"        <AutoExtend>true</AutoExtend>\n" +
				"        <WaitingRoom>false</WaitingRoom>\n" +
				"        <AdvancedProperties>\n" +
				"          <EnableMCUCascading>false</EnableMCUCascading>\n" +
				"          <AllowDynamicGrow>false</AllowDynamicGrow>\n" +
				"          <DurationAfterLeft>P0Y0M0DT0H1M0.000S</DurationAfterLeft>\n" +
				"          <AlertDurationBeforeTermination>P0Y0M0DT0H0M0.000S</AlertDurationBeforeTermination>\n" +
				"          <TerminationCondition>AFTER_ALL_PARTIES_LEFT</TerminationCondition>\n" +
				"          <MaxParticipants>250</MaxParticipants>\n" +
				"          <MaxRoomParticipants>250</MaxRoomParticipants>\n" +
				"        </AdvancedProperties>\n" +
				"        <OneTimePINRequired>false</OneTimePINRequired>\n" +
				"        <Layout>\n" +
				"          <LayoutName>Main</LayoutName>\n" +
				"          <LayoutType>0000</LayoutType>\n" +
				"          <Dynamic>true</Dynamic>\n" +
				"          <NoSelfSee>true</NoSelfSee>\n" +
				"        </Layout>\n" +
				"        <Layout>\n" +
				"          <LayoutName>Customer</LayoutName>\n" +
				"          <LayoutType>0000</LayoutType>\n" +
				"          <Dynamic>false</Dynamic>\n" +
				"          <NoSelfSee>true</NoSelfSee>\n" +
				"        </Layout>\n" +
				"        <ConferenceId>1032</ConferenceId>\n" +
				"        <Status>FINISHED</Status>\n" +
				"        <Subject>dev's vr</Subject>\n" +
				"        <Description/>\n" +
				"        <StartTime>2019-08-13T14:37:51.872+08:00</StartTime>\n" +
				"        <EarlyTime>2019-08-13T14:22:51.872+08:00</EarlyTime>\n" +
				"        <EventConference>false</EventConference>\n" +
				"        <PlannedEndTime>2019-08-13T15:07:51.811+08:00</PlannedEndTime>\n" +
				"        <Duration>P0Y0M0DT23H43M0.000S</Duration>\n" +
				"        <LocationId>0001</LocationId>\n" +
				"        <SendingNotification>false</SendingNotification>\n" +
				"        <RecordingMeetingWhenStart>false</RecordingMeetingWhenStart>\n" +
				"        <ReccurencePatternChanged>false</ReccurencePatternChanged>\n" +
				"        <RecipentsChanged>false</RecipentsChanged>\n" +
				"        <AddRecipents>false</AddRecipents>\n" +
				"        <RemovePersonalTerminals>false</RemovePersonalTerminals>\n" +
				"        <CheckTerminalConflicts>false</CheckTerminalConflicts>\n" +
				"        <CSRSetting>\n" +
				"          <Public>false</Public>\n" +
				"          <QandAEnabled>false</QandAEnabled>\n" +
				"          <AccessModeSetting/>\n" +
				"        </CSRSetting>\n" +
				"      </Conference>\n" +
				"    </Get_Conference_Response>\n" +
				"  </Response>\n" +
				"</MCU_XML_API>\n";
		String number = "1234";

		System.out.println(CcXmlUtil.getConferenceIdByNumber(xmlStr,number));
	}
}

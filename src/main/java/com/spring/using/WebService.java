package com.spring.using;

import cn.hutool.http.webservice.SoapClient;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.List;

/**
 * @author 砒霜
 */
public class WebService {
    public static void main(String[] args) {

        LisCriticalValueMessagePO lisCriticalValueMessagePO = new LisCriticalValueMessagePO();
        lisCriticalValueMessagePO.setDockerName("测试医生");
        lisCriticalValueMessagePO.setTelNumber("15958011074");
        lisCriticalValueMessagePO.setOrgMesId("110120");
        lisCriticalValueMessagePO.setPatientName("测试病人");
        lisCriticalValueMessagePO.setArchivesId("336263");
        String url ="http://10.120.22.100/pay/fyywebservice.asmx";
        SoapClient soapClient = SoapClient.create(url)
                .setMethod("web:CommonWebService","http://tempuri.org/")
                .setParam("methodName","addsms")
                .setParam("inStr",messageBody(lisCriticalValueMessagePO));
        System.out.println(soapClient);
        String result =soapClient.send(true);
        result = StringEscapeUtils.unescapeXml(result);
    }
    /**
     * 拼接短信内容
     * @param lisCriticalValueMessagePO
     * @return
     */
    private static String messageBody(LisCriticalValueMessagePO lisCriticalValueMessagePO) {
        String bodyAll = "【检验】危急值通知：\n【"+lisCriticalValueMessagePO.getDockerName()+"】医生，\n您的患者【"+lisCriticalValueMessagePO.getPatientName()+"】门诊号：【"+lisCriticalValueMessagePO.getArchivesId()+"】联系电话：【"+lisCriticalValueMessagePO.getPatientTelNumber()+"】存在危急值；";
        List<LisCriticalValueMessagePO.CriticalValueItemsList> item = lisCriticalValueMessagePO.getItem();
        for (int i = 0; i < item.size(); i++) {
            bodyAll = bodyAll +"检验项目：【"+item.get(i).getItemsName()+"】 结果：【"+item.get(i).getResult()+"】单位：【"+item.get(i).getUnit()+"】，请及时处置";
        }
        String he = "<interface>\n" +
                "    <zzjgdm>470331293</zzjgdm>\n" +
                "    <pwd></pwd>\n" +
                "    <send_system>2</send_system>\n" +
                "    <org_mes_id>"+lisCriticalValueMessagePO.getOrgMesId()+"</org_mes_id>\n" +
                "    <telnumber>"+lisCriticalValueMessagePO.getTelNumber()+"</telnumber>\n" +
                "    <send_name>"+lisCriticalValueMessagePO.getSendName()+"</send_name>\n" +
                "    <message>\n" +
                "        <template>OA</template>\n" +
                "        <content>\n" +
                "            <OA>"+bodyAll+"</OA>\n" +
                "        </content>\n" +
                "    </message>\n" +
                "</interface>";
        return he;
    }
}

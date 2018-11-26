import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        String xml = "\n" +
                "<xml><ToUserName><![CDATA[gh_17d4d5e39137]]></ToUserName>\n" +
                "<FromUserName><![CDATA[o_tkt1ARaxx-f4_tH_1jGTQb2kJY]]></FromUserName>\n" +
                "<CreateTime>1543194491</CreateTime>\n" +
                "<MsgType><![CDATA[text]]></MsgType>\n" +
                "<Content><![CDATA[/::~]]></Content>\n" +
                "<MsgId>6627969870643804513</MsgId>\n" +
                "</xml>";
        Map<String, String> map = new HashMap<>();
        InputSource in = new InputSource(new StringReader(xml));
        in.setEncoding("UTF-8");
        SAXReader reader = new SAXReader();
        Document document = reader.read(in);
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
//        for(Iterator<Element> it = elements.iterator();it.hasNext();){
//            Element element = it.next();
//            System.out.println(element.getName()+" : "+element.getTextTrim());
//        }
        for(Element e:elements) {
            map.put(e.getName(), e.getStringValue());
        }
        System.out.println(map);

    }
}

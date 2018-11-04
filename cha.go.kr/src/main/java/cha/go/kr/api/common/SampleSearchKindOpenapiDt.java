package cha.go.kr.api.common;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.web.client.RestTemplate;

import cha.go.kr.api.model.SearchDetailVO;

public class SampleSearchKindOpenapiDt {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		String url="http://www.cha.go.kr/cha/SearchKindOpenapiDt.do?ccbaKdcd= {ccbaKdcd}&ccbaCtcd= {ccbaCtcd}&ccbaAsno= {ccbaAsno}";
		
		RestTemplate rtl = new RestTemplate();
		
		SearchDetailVO obj = rtl.getForObject(url,SearchDetailVO.class,
				new HashMap(){{
					put("ccbaKdcd","11");
					put("ccbaCtcd","37");
					put("ccbaAsno","00310000");
		
		}});
		
		System.out.println(obj.toString());
		/*String url="http://www.cha.go.kr/cha/SearchKindOpenapiDt.do";
		
		URI uri = new URIBuilder(url).addParameters(new ArrayList() {{
			
		add(new BasicNameValuePair("ccbaKdcd","11"));
		add(new BasicNameValuePair("ccbaCtcd","37"));
		add(new BasicNameValuePair("ccbaAsno","00310000"));
			
		}}).build();
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse res = null;
		HttpGet httpGet = new HttpGet(uri);
		res = httpclient.execute(httpGet);
		
		// 상태값 확인
		System.out.println(res.getStatusLine().toString());

		HttpEntity entity      = res.getEntity();
		String responseStr = EntityUtils.toString(entity);
		EntityUtils.consume(entity);
		
		// 상태값 확인
		System.out.println(responseStr);*/

	}

}

package cha.go.kr.api.common;

import java.util.HashMap;

import org.springframework.web.client.RestTemplate;

public class SampleSearchKindOpenapiList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="http://www.cha.go.kr/cha/SearchKindOpenapiList.do?ccbaMnm1= {ccbaMnm1}";
		
		RestTemplate rtl = new RestTemplate();
		
		Object obj = rtl.getForObject(url,String.class,new HashMap(){{put("ccbaMnm1","첨성대");}});
		
		System.out.println(obj);

	}

}

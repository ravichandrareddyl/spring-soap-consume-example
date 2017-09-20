package com.raviapp;

import net.webservicex.GetQuoteResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
	      ApplicationContext ctx = SpringApplication.run(Application.class, args);

//	      CallClient bean = ctx.getBean(CallClient.class);
//	      GetQuoteResponse res = bean.getQuote("MSFT");
//	      System.out.println("res"+ res.getGetQuoteResult());
	      
	      
	      QuoteClient client = ctx.getBean(QuoteClient.class); 
	      GetQuoteResponse res = client.getQuote("ORCL");
	      System.out.println("res"+ res.getGetQuoteResult());
	   }

}

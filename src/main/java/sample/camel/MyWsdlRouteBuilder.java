/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.camel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.converter.stream.InputStreamCache;
import org.apache.camel.dataformat.soap.SoapDataFormat;
import org.apache.camel.dataformat.soap.SoapJaxbDataFormatConfigurer;
import org.apache.camel.dataformat.soap.name.ElementNameStrategy;
import org.apache.camel.dataformat.soap.name.ServiceInterfaceStrategy;
import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.spi.DataFormat;
import org.apache.cxf.headers.Header;
import org.apache.cxf.message.MessageContentsList;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CancelVisaG2GRequestMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic.CancelVisaG2GResponseMessage;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.ArrayOfCancelVisaStatus;
import org.datacontract.schemas._2004._07.mofa_visa_nic_g2gservice.CancelVisaStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.customerservice.Customer;
import com.example.customerservice.CustomerService;
import com.example.customerservice.NoSuchCustomer;
import com.example.customerservice.NoSuchCustomerException;

import https.www_w3schools_com.xml.CelsiusToFahrenheit;
import https.www_w3schools_com.xml.CelsiusToFahrenheitResponse;
import https.www_w3schools_com.xml.TempConvertHttpPost;
import https.www_w3schools_com.xml.TempConvertSoap;
import sa.gov.mofa.schemas.nicg2gservice.INicG2GService;
import sa.gov.mofa.schemas.nicg2gservice.NicG2GService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import sample.camel.repository.CustomerRepository;

/**
 * This class demonstrate how to expose a SOAP endpoint starting from a wsdl, using the cxf-codegen-plugin
 */
@Component
public class MyWsdlRouteBuilder extends RouteBuilder {

	private final CustomerRepository customerRepository;
	@Autowired
	CelciusToFBuilder celciusToFBuilder;
	@Autowired
	CelciusToFBuilderResp celciusToFBuilderResp;

	public MyWsdlRouteBuilder(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Bean
	CxfEndpoint customers() {
		CxfEndpoint customersEndpoint = new CxfEndpoint();
		//customersEndpoint.setWsdlURL("wsdl/MofaToNic.wsdl");
		//customersEndpoint.setWsdlURL("wsdl/cur.wsdl");
		//customersEndpoint.setServiceClass(INicG2GService.class);
		//customersEndpoint.setAddress("/nic");
		customersEndpoint.setAddress("/cur");
		customersEndpoint.setServiceClass(TempConvertSoap.class);
		customersEndpoint.setProperties(new HashMap<>());
		// Request validation will be executed, in particular the name validation in getCustomersByName
		customersEndpoint.getProperties().put("schema-validation-enabled", "true");
		

		return customersEndpoint;
	}

	@Override
	public void configure() throws Exception {
		// CustomerService is generated with cxf-codegen-plugin during the build
		//String WS_URI = "cxf://https://172.22.105.55/Mofa.Visa.Nic.G2G/NicG2GService.svc?serviceClass=sa.gov.mofa.schemas.nicg2gservice.INicG2GService&dataFormat=CXF_MESSAGE";
		//SoapDataFormat dataFormat = new SoapDataFormat("sa.gov.mofa.schemas.nicg2gservice", new ServiceInterfaceStrategy(INicG2GService.class, false));
		String WS_URI = "cxf://https://www.w3schools.com/xml/tempconvert.asmx?serviceClass=https.www_w3schools_com.xml.TempConvertSoap";
		//SoapDataFormat dataFormat = new SoapDataFormat("https.www_w3schools_com.xml", new ServiceInterfaceStrategy(TempConvertSoap.class, true));
		//dataFormat.setVersion("1.1");
		 List<String> list = new ArrayList<>();
		//JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();
		//jaxbDataFormat.setContextPath(org.apache.cxf.message.MessageContentsList.class.getPackage().getName());
		
		from("cxf:bean:customers")
		.log("${body}")
		//.setBody(exchange -> exchange.getIn().getBody(String.class) )
		.log("${body}")
		.to("direct:client")
		;
		
		from("direct:client")
		//.setBody(exchange -> exchange.getMessage().getBody(String.class))
		.to("log:DEBUG?showBody=true&showHeaders=true")
		.setHeader("accept-encoding", constant(""))
		//.setHeader("content-type", constant("text/xml; charset=utf-8"))
		.to("log:DEBUG?showBody=true&showHeaders=false")
		.to(WS_URI)
		.process(exchange ->{
			System.out.println(exchange.getMessage().getBody());
			System.out.println(exchange.getMessage().getHeader(Header.HEADER_LIST));
		})
		.to("log:DEBUG?showBody=true&showHeaders=false")
		;
	}
}


@Component
class CelciusToFBuilder{
	
	public CelsiusToFahrenheit getCelsiusToFahrenheit(String str) {
		CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
		cf.setCelsius(str);
		return cf;
	}
	
}


@Component
class CelciusToFBuilderResp{
	
public String getCelsiusToFahrenheitResponse(CelsiusToFahrenheitResponse bytes) {
	
	String s = new String(bytes.getCelsiusToFahrenheitResult());
	return s;
}
}
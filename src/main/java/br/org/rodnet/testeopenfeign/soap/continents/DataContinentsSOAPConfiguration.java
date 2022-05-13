package br.org.rodnet.testeopenfeign.soap.continents;

import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.jaxb.JAXBContextFactory;
import feign.soap.SOAPDecoder;
import feign.soap.SOAPEncoder;
import org.springframework.context.annotation.Bean;

class DataContinentsSOAPConfiguration {

    private static final JAXBContextFactory jaxbFactory = new JAXBContextFactory.Builder()
            .withMarshallerSchemaLocation("${continents.soap.url} ${continents.soap.wsdl}")
            .build();

    @Bean
    Encoder soapEncoder() {
        return new SOAPEncoder(jaxbFactory);
    }

    @Bean
    Decoder soapDecoder() {
        return new SOAPDecoder(jaxbFactory);
    }

}

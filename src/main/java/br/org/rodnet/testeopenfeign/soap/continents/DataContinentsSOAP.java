package br.org.rodnet.testeopenfeign.soap.continents;

import br.org.rodnet.dataaccess.stub.ListOfContinentsByName;
import br.org.rodnet.dataaccess.stub.ListOfContinentsByNameResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "dataContinents",
        url = "${continents.soap.url}",
        configuration = DataContinentsSOAPConfiguration.class)
public interface DataContinentsSOAP {
    @PostMapping(produces = MediaType.TEXT_XML_VALUE, consumes = MediaType.TEXT_XML_VALUE)
    ListOfContinentsByNameResponse nomesContinentes(@RequestBody ListOfContinentsByName request);

    //@PostMapping(produces = MediaType.TEXT_XML_VALUE, consumes = MediaType.TEXT_XML_VALUE)
    //NumberToDollarsResponse dolaresPorExtenso(@RequestBody NumberToDollars request);
}

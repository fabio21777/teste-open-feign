package br.org.rodnet.testeopenfeign.soap.dataaccess;

import br.org.rodnet.dataaccess.stub.ListOfContinentsByName;
import br.org.rodnet.dataaccess.stub.ListOfContinentsByNameResponse;
import br.org.rodnet.testeopenfeign.soap.continents.DataContinentsSOAP;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataContinentsSoapTest {

    @Autowired
    private    DataContinentsSOAP   dataContinentsSOAP;

    @Test
    void getAllContinents() {
        ListOfContinentsByName listOfContinentsByName = new ListOfContinentsByName();
        ListOfContinentsByNameResponse listOfContinentsByNameResponse = dataContinentsSOAP.nomesContinentes(listOfContinentsByName);
        listOfContinentsByNameResponse.getListOfContinentsByNameResult().getTContinent().forEach(cotinente -> {
            System.out.println(cotinente.getSName()+ "--"+cotinente.getSCode());

        });
    }


}

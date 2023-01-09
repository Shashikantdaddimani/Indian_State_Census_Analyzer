package Com.java.bridgelab;

import org.junit.Assert;
import org.junit.Test;



public class CensusAnalyserTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH ="C:\\Users\\Rajani daddimani\\Desktop\\java basic porgrams\\Indian_Census_Anlyser\\IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }

}

package com.company;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public interface CalculatorDataProvider {
    @DataProvider(name = "dataProviderSubtraction")
    static Object[][] dataProviderSubtraction(){
        return new Object[][]{{3,1, 2}, {6,7,-1}, {4,1,3}};
    }

    @DataProvider(name = "dataProviderAddition")
    static Object[][] dataProviderAddition(){
        return new Object[][] {{2, 3 , 5}, {6, 7, 13}, {1, 4, 5}, {2, 4, 6}};
    }
    @DataProvider(name = "dataProviderMultiplication")
    static Object[][] dataProviderMultiplication(){
        return new Object[][]{{1,2,2}, {6,7,42}, {5,6,30}, {5,5,25}};
    }
    @DataProvider(name = "dataProviderDivision")
    static Object[][] dataProviderDivision(){
        return new Object[][]{{4,2,2}, {15, 3, 5}, {36, 6, 6}};
    }
}

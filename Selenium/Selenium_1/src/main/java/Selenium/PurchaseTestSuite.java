package Selenium;

import Selenium.categories.CartTests;
import Selenium.categories.PurchaseTests;
import Selenium.tests.HandbageCataloguePageTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({PurchaseTests.class, CartTests.class})
@Suite.SuiteClasses({HandbageCataloguePageTest.class})
public class PurchaseTestSuite {
}

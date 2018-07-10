package com.pm.db.service.test;

import java.io.File;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {"classpath*:/test-ApplicationContext.xml", "classpath*:/pm-ApplicationContext.xml"})
public abstract class AbstractServiceTest {

	private static final String FLAT_XML_DATASET = "src/test/resources/sampledata.xml";
	
	@Autowired
	HibernateOperations hibernateTemplate;
	
	private IDatabaseTester databaseTester;
	
	@Value("${dataSource.driverClassName}")
	private String driver;

	@Value("${dataSource.url}")
	private String url;

	@Value("${dataSource.username}")
	private String userName;

	@Value("${dataSource.password}")
	private String password;
	

    @Before
    public void testDBUnit() throws Exception {
        databaseTester = new JdbcDatabaseTester(driver, url, userName, password);
        IDataSet dataSet = new FlatXmlDataSetBuilder().build(new File(FLAT_XML_DATASET));
        databaseTester.setDataSet(dataSet);
        databaseTester.onSetup();
        mockDataSetup();
    }
    
    @After
    public void tearDown() throws Exception {
        databaseTester.onTearDown();
    }

    public void mockDataSetup(){
    }
    
}
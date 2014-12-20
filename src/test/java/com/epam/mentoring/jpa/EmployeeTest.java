package com.epam.mentoring.jpa;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;

import com.epam.mentoring.jpa.dao.EmployeeDao;
import com.epam.mentoring.jpa.entities.Employee;
import com.epam.mentoring.jpa.service.EmployeeService;
import junit.framework.TestCase;
import org.dbunit.DBTestCase;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.dataset.xml.XmlDataSet;
import org.dbunit.ext.hsqldb.HsqldbDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.impl.SessionImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.Persistence;
import javax.sql.DataSource;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */
public class EmployeeTest /*extends DBTestCase*/ {
 // private static final String JDBC_DRIVER = org.h2.Driver.class.getName();
  private static final String JDBC_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
  private static final String USER = "sa";
  private static final String PASSWORD = "";

  private static EmployeeService service = null;
  private IDataSet dataset;

//  public EmployeeTest(String name)
//  {
//    super( name );
//    System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, JDBC_DRIVER );
//    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, JDBC_URL);
//    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, USER);
//    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, PASSWORD);
//    //System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_SCHEMA, "work");
//    // System.setProperty( PropertiesBasedJdbcDatabaseTester.DBUNIT_SCHEMA, "" );
//    final PreparedStatement preparedStatement;
//    try {
//      preparedStatement = getDatabaseTester().getConnection().getConnection().prepareStatement( "CREATE TABLE EMPLOYEE" +
//        "( EMPLOYEE_ID int," +
//        "EMPLOYEE_NAME varchar(55)); " );
//      preparedStatement.executeUpdate();
//    } catch (Exception e){
//
//    }
//  }
//
//  @BeforeClass
//  public static void createSchema() throws Exception {
//
//
//    RunScript.execute( JDBC_URL, USER, PASSWORD, "schema.sql", Charset.forName("UTF8"), false );
//
////    service = new EmployeeService();
////    DatabaseConnection connection = new DatabaseConnection(((SessionImpl)(service.getEm().getDelegate())).connection());
////    connection.getConfig().setProperty( DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqldbDataTypeFactory());
//
//    FlatXmlDataSetBuilder flatXmlDataSetBuilder = new FlatXmlDataSetBuilder();
//    flatXmlDataSetBuilder.setColumnSensing(true);
//    IDataSet dataset = flatXmlDataSetBuilder.build(
//      Thread.currentThread().getContextClassLoader().getResourceAsStream("dataset.xml"));
//  }
//
//  @Before
//  public void importDataSet() throws Exception {
//    //IDataSet dataSet = readDataSet();
//    service = new EmployeeService();
//    DatabaseConnection connection = new DatabaseConnection(((SessionImpl)(service.getEm().getDelegate())).connection());
//    connection.getConfig().setProperty( DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new HsqldbDataTypeFactory());
//    cleanlyInsert(dataset);
//  }
////
////  private IDataSet readDataSet() throws Exception {
////    return new FlatXmlDataSetBuilder().build(new File("dataset.xml"));
////  }
//
//  private void cleanlyInsert(IDataSet dataSet) throws Exception {
//    IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
//    databaseTester.setSetUpOperation( DatabaseOperation.CLEAN_INSERT);
//    databaseTester.setDataSet(dataSet);
//    databaseTester.onSetup();
//  }
//
//  @Test
//  public void testGetEmployee() throws Exception {
//    EmployeeDao repository = new EmployeeDao(service.getEm());
//    Employee employee = repository.findEmployee( 1l );
//
//    Assert.assertEquals( employee.getId(), new Long( 1 ) );
//    Assert.assertEquals( employee.getName(), "Brown" );
//}
////
////  @Test
////  public void returnsNullWhenPersonCannotBeFoundByFirstName() throws Exception {
////    EmployeeDao repository = new EmployeeDao(dataSource());
////    Employee person = repository.findEmployee(10l);
////
////    Assert.assertThat(person, is(nullValue()));
////  }
//
////  private DataSource dataSource() {
////    JdbcDataSource dataSource = new JdbcDataSource();
////    dataSource.setURL(JDBC_URL);
////    dataSource.setUser(USER);
////    dataSource.setPassword(PASSWORD);
////    return dataSource;
////  }
//
//  protected IDataSet getDataSet() throws Exception
//  {
//    return new XmlDataSet( new FileInputStream(new File("src/test/resources/dataset.xml")));
//}

}

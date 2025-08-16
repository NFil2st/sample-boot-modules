// package th.mfu;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// @AutoConfigureMockMvc
// @EnableAutoConfiguration(exclude = {
//         org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
//         org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
// })
// public class HelloControllerTest {

//     @Autowired
//     private HelloController controller;

//     @Test
//     public void testHello() {
//         String response = controller.hello();
//         assertEquals("Hello World!", response);
//     }
// }



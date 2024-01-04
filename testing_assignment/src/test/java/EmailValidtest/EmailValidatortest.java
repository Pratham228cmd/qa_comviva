package EmailValidtest;

import EmailValid.EmailValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmailValidatortest {
	@Test
		public void emailtest() {
			EmailValidator obj= new EmailValidator();
			assertTrue(obj.isValidEmail("pratham@gmail.com"));
			assertFalse(obj.isValidEmail("pratham.com")); 
			assertFalse(obj.isValidEmail("pratham@gmail"));	
			assertFalse(obj.isValidEmail(""));
		}
		@Test
		public void companyemailtest() {
			EmailValidator obj= new EmailValidator();
			assertTrue(obj.isCorporateEmail("pratham@company.com")); 
			assertFalse(obj.isCorporateEmail("pratham@company"));
			assertFalse(obj.isCorporateEmail("prathamcompany.com"));
		}
}

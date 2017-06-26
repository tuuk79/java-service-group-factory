import static org.junit.Assert.*;
import org.junit.Test;

public class ServiceGroupFactoryShould {

	@Test
	public void CreateAServiceGroupFactory() {
		IServiceGroupFactory serviceGroupFactory = new ServiceGroupFactory();
		assertNotNull(serviceGroupFactory);
	}
	
	@Test
	public void CreateATechnologyServiceGroup() throws Exception {
		String serviceGroupName = "technology";
		
		IServiceGroupFactory serviceGroupFactory = new ServiceGroupFactory();
		IServiceGroup serviceGroup = serviceGroupFactory.create(serviceGroupName);
		assertTrue(serviceGroup instanceof TechnologyServiceGroup);
	}
	
	@Test(expected = Exception.class)
	public void CreateAServiceGroupException() throws Exception {
		String serviceGroupName = "somethingelse";
		
		IServiceGroupFactory serviceGroupFactory = new ServiceGroupFactory();
		IServiceGroup serviceGroup = serviceGroupFactory.create(serviceGroupName);
	}

}

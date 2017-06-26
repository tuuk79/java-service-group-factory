
public class ServiceGroupFactory implements IServiceGroupFactory {

	@Override
	public ServiceGroup create(String serviceGroupName) throws Exception {
		ServiceGroup serviceGroup = null;
		
		switch (serviceGroupName) {
			case "technology":
				serviceGroup = new TechnologyServiceGroup();
				break;
			default:
				throw new Exception("no service group by that name");
		}
		return serviceGroup;
	}

}

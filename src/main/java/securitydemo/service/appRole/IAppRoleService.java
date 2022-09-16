package securitydemo.service.appRole;

import securitydemo.model.AppRole;
import securitydemo.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {

    AppRole findByName(String name);

}

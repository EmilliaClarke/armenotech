package groovy

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import de.hybris.platform.commerceservices.security.impl.DefaultSecureTokenService;
import com.pearson.b2c.facades.account.PearsonCustomerFacade
import com.pearson.b2c.facades.account.data.RegisterAdditionalData
import de.hybris.platform.site.BaseSiteService


baseSiteService.setCurrentBaseSite("localization", false)

final RegisterAdditionalData registerData = new RegisterAdditionalData()
registerData.setEmail("email")
registerData.setUserID("userId")
registerData.setPassword("password")
registerData.setFirstName("firstName")
registerData.setLastName("lastName")

return iesPearsonCustomerFacade.registerPearsonCustomer(registerData)
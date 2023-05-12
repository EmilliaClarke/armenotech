package groovy

import java.util.HashMap
import java.util.Map
import org.springframework.core.io.Resource
import de.hybris.platform.commerceservices.security.impl.DefaultSecureTokenService
import com.pearson.b2c.facades.account.PearsonCustomerFacade
import com.pearson.b2c.facades.account.data.RegisterAdditionalData
import de.hybris.platform.site.BaseSiteService


baseSiteService.setCurrentBaseSite("localization", false)

return CustomerFacade.getCustomerByUsername("userId").uid
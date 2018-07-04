package splunk.chart.portlet;

import splunk.chart.constants.SplunkChartPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.splunk.Service;
import java.io.IOException;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author oharrari
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=splunk-chart Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SplunkChartPortletKeys.SplunkChart,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SplunkChartPortlet extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(SplunkChartPortlet.class);
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
            
        Service service = ServiceSplunk.getInstance().getService();
        
        _log.info("Auth Token : " + service.getToken());
        _log.info("works");
        
	}
}
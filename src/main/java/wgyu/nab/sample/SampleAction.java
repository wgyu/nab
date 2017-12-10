package wgyu.nab.sample;

import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

public class SampleAction {
	public HttpResponse index(HttpRequest request, ExecutionContext context) {
		int aa = "test"
		context.setRequestScopedVar("aa", aa);
		
		return new HttpResponse("/WEB-INF/view/sample/index.jsp");
	}

}

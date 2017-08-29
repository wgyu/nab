package wgyu.nab.sample;

import nablarch.fw.ExecutionContext;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

public class SampleAction {
	public HttpResponse index(HttpRequest request, ExecutionContext context) {
		
		return new HttpResponse("/WEB-INF/view/sample/index.jsp");
	}

}

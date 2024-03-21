package br.com.senior.mydomain.myservice;

import org.springframework.stereotype.Component;

import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.MessageHandler;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import br.com.senior.MetadataService;

@HandlerImpl
@Component("my_domain.my_service.getDependencies")
public class GetDependenciesImpl implements GetDependencies, MessageHandler {

	private MetadataService metadataService;
	
	@Inject
	public GetDependenciesImpl(MetadataService metadataService) {
		this.metadataService = metadataService;
	}

	@Override
	public GetDependenciesOutput getDependencies() {
		List<Dependency> dependencies = metadataService.getDependencies()
			.stream()
			.map(dependency -> new Dependency(dependency.getDomain(), dependency.getService(), dependency.getVersion()))
			.collect(Collectors.toList());

		return new GetDependenciesOutput(dependencies);
	}
}

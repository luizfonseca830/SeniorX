package br.com.senior.mydomain.myservice;

import java.util.List;

public class DependencyStringSerializer {
    
	public static final DependencyStringSerializer INSTANCE = new DependencyStringSerializer();
    
    public void serialize(Dependency dependency, StringBuilder sb, List<Object> appended) {
		sb.append(dependency.getClass().getSimpleName()).append(" [");
		if (appended.contains(dependency)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(dependency);
		serializeDomain(dependency, sb);
		sb.append(", ");
		serializeService(dependency, sb);
		sb.append(", ");
		serializeVersion(dependency, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDomain(Dependency dependency, StringBuilder sb) {
		sb.append("domain=").append(dependency.domain == null ? "null" : dependency.domain);
	}
	
	protected void serializeService(Dependency dependency, StringBuilder sb) {
		sb.append("service=").append(dependency.service == null ? "null" : dependency.service);
	}
	
	protected void serializeVersion(Dependency dependency, StringBuilder sb) {
		sb.append("version=").append(dependency.version == null ? "null" : dependency.version);
	}
}

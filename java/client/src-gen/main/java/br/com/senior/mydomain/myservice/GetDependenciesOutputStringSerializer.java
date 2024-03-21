package br.com.senior.mydomain.myservice;

import java.util.List;

public class GetDependenciesOutputStringSerializer {
    
	public static final GetDependenciesOutputStringSerializer INSTANCE = new GetDependenciesOutputStringSerializer();
    
    public void serialize(GetDependenciesOutput getDependenciesOutput, StringBuilder sb, List<Object> appended) {
		sb.append(getDependenciesOutput.getClass().getSimpleName()).append(" [");
		if (appended.contains(getDependenciesOutput)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(getDependenciesOutput);
		serializeDependencies(getDependenciesOutput, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDependencies(GetDependenciesOutput getDependenciesOutput, StringBuilder sb, List<Object> appended) {
		sb.append("dependencies=<");
		if (getDependenciesOutput.dependencies == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = getDependenciesOutput.dependencies.size() - 1;
			for (int i = 0; i <= last; i++) {
				getDependenciesOutput.dependencies.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}

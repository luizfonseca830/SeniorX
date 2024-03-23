package br.com.senior.mydomain.myservice;

import java.util.List;

public class HookdtoStringSerializer {
    
	public static final HookdtoStringSerializer INSTANCE = new HookdtoStringSerializer();
    
    public void serialize(Hookdto hookdto, StringBuilder sb, List<Object> appended) {
		sb.append(hookdto.getClass().getSimpleName()).append(" [");
		if (appended.contains(hookdto)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(hookdto);
		serializeHookFunction(hookdto, sb);
		sb.append(", ");
		serializeScript(hookdto, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeHookFunction(Hookdto hookdto, StringBuilder sb) {
		sb.append("hookFunction=").append(hookdto.hookFunction == null ? "null" : hookdto.hookFunction);
	}
	
	protected void serializeScript(Hookdto hookdto, StringBuilder sb) {
		sb.append("script=").append(hookdto.script == null ? "null" : hookdto.script);
	}
}

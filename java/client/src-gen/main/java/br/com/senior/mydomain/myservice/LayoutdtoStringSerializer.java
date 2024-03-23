package br.com.senior.mydomain.myservice;

import java.util.List;

public class LayoutdtoStringSerializer {
    
	public static final LayoutdtoStringSerializer INSTANCE = new LayoutdtoStringSerializer();
    
    public void serialize(Layoutdto layoutdto, StringBuilder sb, List<Object> appended) {
		sb.append(layoutdto.getClass().getSimpleName()).append(" [");
		if (appended.contains(layoutdto)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(layoutdto);
		serializeId(layoutdto, sb);
		sb.append(", ");
		serializeDescription(layoutdto, sb);
		sb.append(", ");
		serializeFileFormat(layoutdto, sb);
		sb.append(", ");
		serializeErrorStrategy(layoutdto, sb);
		sb.append(", ");
		serializeDelimiter(layoutdto, sb);
		sb.append(", ");
		serializeSkipLines(layoutdto, sb);
		sb.append(", ");
		serializeFields(layoutdto, sb, appended);
		sb.append(", ");
		serializeHooks(layoutdto, sb, appended);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("id=").append(layoutdto.id == null ? "null" : layoutdto.id);
	}
	
	protected void serializeDescription(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("description=").append(layoutdto.description == null ? "null" : layoutdto.description);
	}
	
	protected void serializeFileFormat(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("fileFormat=").append(layoutdto.fileFormat == null ? "null" : layoutdto.fileFormat);
	}
	
	protected void serializeErrorStrategy(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("errorStrategy=").append(layoutdto.errorStrategy == null ? "null" : layoutdto.errorStrategy);
	}
	
	protected void serializeDelimiter(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("delimiter=").append(layoutdto.delimiter == null ? "null" : layoutdto.delimiter);
	}
	
	protected void serializeSkipLines(Layoutdto layoutdto, StringBuilder sb) {
		sb.append("skipLines=").append(layoutdto.skipLines == null ? "null" : layoutdto.skipLines);
	}
	
	protected void serializeFields(Layoutdto layoutdto, StringBuilder sb, List<Object> appended) {
		sb.append("fields=<");
		if (layoutdto.fields == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = layoutdto.fields.size() - 1;
			for (int i = 0; i <= last; i++) {
				layoutdto.fields.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
	
	protected void serializeHooks(Layoutdto layoutdto, StringBuilder sb, List<Object> appended) {
		sb.append("hooks=<");
		if (layoutdto.hooks == null) {
			sb.append("null");
		} else {
			sb.append('[');
			int last = layoutdto.hooks.size() - 1;
			for (int i = 0; i <= last; i++) {
				layoutdto.hooks.get(i).toString(sb, appended);
				if (i < last) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
	}
}

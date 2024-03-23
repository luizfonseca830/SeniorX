package br.com.senior.mydomain.myservice;

import java.util.List;

public class FielddtoStringSerializer {
    
	public static final FielddtoStringSerializer INSTANCE = new FielddtoStringSerializer();
    
    public void serialize(Fielddto fielddto, StringBuilder sb, List<Object> appended) {
		sb.append(fielddto.getClass().getSimpleName()).append(" [");
		if (appended.contains(fielddto)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(fielddto);
		serializeId(fielddto, sb);
		sb.append(", ");
		serializeName(fielddto, sb);
		sb.append(", ");
		serializeFieldType(fielddto, sb);
		sb.append(", ");
		serializeStart(fielddto, sb);
		sb.append(", ");
		serializeSize(fielddto, sb);
		sb.append(", ");
		serializeMaskPattern(fielddto, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeId(Fielddto fielddto, StringBuilder sb) {
		sb.append("id=").append(fielddto.id == null ? "null" : fielddto.id);
	}
	
	protected void serializeName(Fielddto fielddto, StringBuilder sb) {
		sb.append("name=").append(fielddto.name == null ? "null" : fielddto.name);
	}
	
	protected void serializeFieldType(Fielddto fielddto, StringBuilder sb) {
		sb.append("fieldType=").append(fielddto.fieldType == null ? "null" : fielddto.fieldType);
	}
	
	protected void serializeStart(Fielddto fielddto, StringBuilder sb) {
		sb.append("start=").append(fielddto.start == null ? "null" : fielddto.start);
	}
	
	protected void serializeSize(Fielddto fielddto, StringBuilder sb) {
		sb.append("size=").append(fielddto.size == null ? "null" : fielddto.size);
	}
	
	protected void serializeMaskPattern(Fielddto fielddto, StringBuilder sb) {
		sb.append("maskPattern=").append(fielddto.maskPattern == null ? "null" : fielddto.maskPattern);
	}
}

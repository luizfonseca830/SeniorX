/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import br.com.senior.springbatchintegration.model.ErrorStrategy;
import br.com.senior.springbatchintegration.model.Field;
import br.com.senior.springbatchintegration.model.FieldType;
import br.com.senior.springbatchintegration.model.Hook;
import br.com.senior.springbatchintegration.model.HookFunction;
import br.com.senior.springbatchintegration.model.Layout;

public final class LayoutDTOConverter {

    private LayoutDTOConverter() {
    	
    }

	public static Layout dtoToLayout(Layoutdto dto) {
	    Layout layout = new Layout();
	    layout.setId(dto.id);
	    layout.setDescription(dto.description);
	    layout.setFileFormat(br.com.senior.springbatchintegration.model.FileFormat.valueOf(dto.fileFormat.name()));
	    layout.setErrorStrategy(ErrorStrategy.valueOf(dto.errorStrategy.name()));
	    layout.setDelimiter(dto.delimiter);
	    layout.setSkipLines(dto.skipLines != null ? dto.skipLines.intValue() : 0);
	    
	    for (Fielddto fielddto: dto.fields) {
	        Field field = new Field();
	        field.setFieldType(FieldType.valueOf(fielddto.fieldType.name()));
	        field.setId(fielddto.id);
	        field.setMaskPattern(fielddto.maskPattern);
	        field.setName(fielddto.name);
	        if (fielddto.size != null) {
	            field.setSize(fielddto.size.intValue());
	        }
	        if (fielddto.start != null) {
	            field.setStart(fielddto.start.intValue());
	        }
	        layout.addField(field);
	    }
	    if (dto.hooks != null) {
	        for (Hookdto hookdto : dto.hooks) {
	            Hook hook = new Hook();
	            hook.setHookFunction(HookFunction.valueOf(hookdto.hookFunction.name()));
	            hook.setScript(hookdto.script);
	            layout.addHook(hook);
	        }
	    }
	    return layout;
	}
    
	public static Layoutdto toDto(Layout layout) {
	    Layoutdto dto = new Layoutdto();
	    dto.delimiter = layout.getDelimiter();
	    dto.description = layout.getDescription();
	    dto.errorStrategy = br.com.senior.mydomain.myservice.ErrorStrategy.valueOf(layout.getErrorStrategy().name());
	    dto.fileFormat = FileFormat.valueOf(layout.getFileFormat().name());
	    dto.id = layout.getId();
	    dto.skipLines = Long.valueOf(layout.getSkipLines());
	    dto.fields = new ArrayList<>();
	    dto.hooks = new ArrayList<>();
	    for (Field field : layout.getFields()) {
	        Fielddto fdto = new Fielddto();
	        fdto.fieldType = br.com.senior.mydomain.myservice.FieldType.valueOf(field.getFieldType().name());
	        fdto.id = field.getId();
	        fdto.maskPattern = field.getMaskPattern();
	        fdto.name = field.getName();
	        fdto.size = Long.valueOf(field.getSize());
	        fdto.start = Long.valueOf(field.getStart());
	        dto.fields.add(fdto);
	    }
	    if (layout.getHooks() != null) {
	        for (Hook hook : layout.getHooks()) {
	            Hookdto hdto = new Hookdto();
	            hdto.hookFunction = br.com.senior.mydomain.myservice.HookFunction.valueOf(hook.getHookFunction().name());
	            hdto.script = hook.getScript();
	            dto.hooks.add(hdto);
	        }
	    }
	    return dto;
	}
}

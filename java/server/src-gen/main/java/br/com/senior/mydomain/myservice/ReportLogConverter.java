/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import br.com.senior.springbatchintegration.model.ImportLog;

public final class ReportLogConverter {

    private ReportLogConverter() {
    	
    }

    public static ImportReport toDTO(ImportLog log, String id) {
        ImportReport report = new ImportReport();
		report.beanClass = log.getBeanClass();				
		report.endTime = log.getEndTime().toInstant();;
		report.errorsCount = Long.valueOf(log.getErrorsCount());
		report.filteredCount = Long.valueOf(log.getFilteredCount());
		report.id = id;
		report.layout = LayoutDTOConverter.toDto(log.getLayout());
		report.serviceClass = log.getServiceClass();
		report.skippedCount = Long.valueOf(log.getSkippedCount());
		report.startTime = log.getStartTime().toInstant();;
		report.sucessCount = Long.valueOf(log.getSucessCount());
		report.uri = log.getUri();
		return report;
    }
}

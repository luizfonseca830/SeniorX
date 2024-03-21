package br.com.senior.mydomain.myservice;

import java.util.List;

public class BlobReferenceStringSerializer {
    
	public static final BlobReferenceStringSerializer INSTANCE = new BlobReferenceStringSerializer();
    
    public void serialize(BlobReference blobReference, StringBuilder sb, List<Object> appended) {
		sb.append(blobReference.getClass().getSimpleName()).append(" [");
		if (appended.contains(blobReference)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(blobReference);
		serializeDomainName(blobReference, sb);
		sb.append(", ");
		serializeServiceName(blobReference, sb);
		sb.append(", ");
		serializeTargetObjectId(blobReference, sb);
		sb.append(", ");
		serializeTargetCopyId(blobReference, sb);
		sb.append(", ");
		sb.append(']');
	}
	
	protected void serializeDomainName(BlobReference blobReference, StringBuilder sb) {
		sb.append("domainName=").append(blobReference.domainName == null ? "null" : blobReference.domainName);
	}
	
	protected void serializeServiceName(BlobReference blobReference, StringBuilder sb) {
		sb.append("serviceName=").append(blobReference.serviceName == null ? "null" : blobReference.serviceName);
	}
	
	protected void serializeTargetObjectId(BlobReference blobReference, StringBuilder sb) {
		sb.append("targetObjectId=").append(blobReference.targetObjectId == null ? "null" : blobReference.targetObjectId);
	}
	
	protected void serializeTargetCopyId(BlobReference blobReference, StringBuilder sb) {
		sb.append("targetCopyId=").append(blobReference.targetCopyId == null ? "null" : blobReference.targetCopyId);
	}
}

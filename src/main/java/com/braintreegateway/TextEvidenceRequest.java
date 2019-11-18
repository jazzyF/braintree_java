package com.braintreegateway;

/**
 * Provides a fluent interface to build up requests around TextEvidence.
 */
public class TextEvidenceRequest extends Request {

    private String content;
    private String category;
    private String sequenceNumber;

    public TextEvidenceRequest content(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }

    /**
     * Please use category instead.
     * @deprecated see #category(String)
     * @param tag the tag to use
     * @return this request
     */
    @Deprecated
    public TextEvidenceRequest tag(String tag) {
        this.category = tag;
        return this;
    }

    public TextEvidenceRequest category(String category) {
        this.category = category;
        return this;
    }

    public TextEvidenceRequest sequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    @Override
    public String toXML() {
        return buildRequest("evidence").toXML();
    }

    protected RequestBuilder buildRequest(String root) {
        return new RequestBuilder(root).
            addElement("comments", content).
            addElement("category", category).
            addElement("sequenceNumber", sequenceNumber);
    }
}

package com.dto;


public class WebsiteDTO  extends AbsCommonDTO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
    private String authKey;
    private String url;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebsiteDTO() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WebsiteDTO websiteTO = (WebsiteDTO) o;

        if (id != null ? !id.equals(websiteTO.id) : websiteTO.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WebsiteeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authKey='" + authKey + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

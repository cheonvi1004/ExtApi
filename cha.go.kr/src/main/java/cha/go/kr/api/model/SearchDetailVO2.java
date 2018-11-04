package cha.go.kr.api.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
public class SearchDetailVO2 {

	@XmlElement(name = "ccbaKdcd")
	private String ccbaKdcd;

	@XmlElement(name = "ccbaAsno")
	private String ccbaAsno;

	@XmlElement(name = "ccbaCtcd")
	private String ccbaCtcd;

	@XmlElement(name = "ccbaCpno")
	private String ccbaCpno;

	private Item item;

	public String getCcbaKdcd() {
		return ccbaKdcd;
	}

	public void setCcbaKdcd(String ccbaKdcd) {
		this.ccbaKdcd = ccbaKdcd;
	}

	public String getCcbaAsno() {
		return ccbaAsno;
	}

	public void setCcbaAsno(String ccbaAsno) {
		this.ccbaAsno = ccbaAsno;
	}

	public String getCcbaCtcd() {
		return ccbaCtcd;
	}

	public void setCcbaCtcd(String ccbaCtcd) {
		this.ccbaCtcd = ccbaCtcd;
	}

	public String getCcbaCpno() {
		return ccbaCpno;
	}

	public void setCcbaCpno(String ccbaCpno) {
		this.ccbaCpno = ccbaCpno;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SearchDetailVO [ccbaKdcd=").append(ccbaKdcd).append(", ccbaAsno=").append(ccbaAsno)
				.append(", ccbaCtcd=").append(ccbaCtcd).append(", ccbaCpno=").append(ccbaCpno).append(", item=")
				.append(item.toString()).append("]");
		return builder.toString();
	}

	@XmlRootElement(name = "item")
	public static class Item {

		@XmlElement(name = "ccmaName")
		private String ccmaName;

		@XmlElement(name = "crltsnoNm")
		private String crltsnoNm;

		@XmlElement(name = "ccbaMnm1")
		private String ccbaMnm1;

		@XmlElement(name = "ccbaMnm2")
		private String ccbaMnm2;

		@XmlElement(name = "gcodeName")
		private String gcodeName;

		@XmlElement(name = "bcodeName")
		private String bcodeName;

		@XmlElement(name = "mcodeName")
		private String mcodeName;

		@XmlElement(name = "scodeName")
		private String scodeName;

		@XmlElement(name = "ccbaQuan")
		private String ccbaQuan;

		@XmlElement(name = "ccbaAsdt")
		private String ccbaAsdt;

		@XmlElement(name = "ccbaCtcdNm")
		private String ccbaCtcdNm;

		@XmlElement(name = "ccsiName")
		private String ccsiName;

		@XmlElement(name = "ccbaLcad")
		private String ccbaLcad;

		@XmlElement(name = "ccceName")
		private String ccceName;

		@XmlElement(name = "ccbaPoss")
		private String ccbaPoss;

		@XmlElement(name = "ccbaAdmin")
		private String ccbaAdmin;

		@XmlElement(name = "ccbaCncl")
		private String ccbaCncl;

		@XmlElement(name = "ccbaCndt")
		private String ccbaCndt;

		@XmlElement(name = "imageUrl")
		private String imageUrl;

		@XmlElement(name = "content")
		private String content;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("info [ccmaName=").append(ccmaName).append(", crltsnoNm=").append(crltsnoNm)
					.append(", ccbaMnm1=").append(ccbaMnm1).append(", ccbaMnm2=").append(ccbaMnm2)
					.append(", gcodeName=").append(gcodeName).append(", bcodeName=").append(bcodeName)
					.append(", mcodeName=").append(mcodeName).append(", scodeName=").append(scodeName)
					.append(", ccbaQuan=").append(ccbaQuan).append(", ccbaAsdt=").append(ccbaAsdt)
					.append(", ccbaCtcdNm=").append(ccbaCtcdNm).append(", ccsiName=").append(ccsiName)
					.append(", ccbaLcad=").append(ccbaLcad).append(", ccceName=").append(ccceName).append(", ccbaPoss=")
					.append(ccbaPoss).append(", ccbaAdmin=").append(ccbaAdmin).append(", ccbaCncl=").append(ccbaCncl)
					.append(", ccbaCndt=").append(ccbaCndt).append(", imageUrl=").append(imageUrl).append(", content=")
					.append(content).append("]");
			return builder.toString();
		}

		public String getCcmaName() {
			return ccmaName;
		}

		public void setCcmaName(String ccmaName) {
			this.ccmaName = ccmaName;
		}

		public String getCrltsnoNm() {
			return crltsnoNm;
		}

		public void setCrltsnoNm(String crltsnoNm) {
			this.crltsnoNm = crltsnoNm;
		}

		public String getCcbaMnm1() {
			return ccbaMnm1;
		}

		public void setCcbaMnm1(String ccbaMnm1) {
			this.ccbaMnm1 = ccbaMnm1;
		}

		public String getCcbaMnm2() {
			return ccbaMnm2;
		}

		public void setCcbaMnm2(String ccbaMnm2) {
			this.ccbaMnm2 = ccbaMnm2;
		}

		public String getGcodeName() {
			return gcodeName;
		}

		public void setGcodeName(String gcodeName) {
			this.gcodeName = gcodeName;
		}

		public String getBcodeName() {
			return bcodeName;
		}

		public void setBcodeName(String bcodeName) {
			this.bcodeName = bcodeName;
		}

		public String getMcodeName() {
			return mcodeName;
		}

		public void setMcodeName(String mcodeName) {
			this.mcodeName = mcodeName;
		}

		public String getScodeName() {
			return scodeName;
		}

		public void setScodeName(String scodeName) {
			this.scodeName = scodeName;
		}

		public String getCcbaQuan() {
			return ccbaQuan;
		}

		public void setCcbaQuan(String ccbaQuan) {
			this.ccbaQuan = ccbaQuan;
		}

		public String getCcbaAsdt() {
			return ccbaAsdt;
		}

		public void setCcbaAsdt(String ccbaAsdt) {
			this.ccbaAsdt = ccbaAsdt;
		}

		public String getCcbaCtcdNm() {
			return ccbaCtcdNm;
		}

		public void setCcbaCtcdNm(String ccbaCtcdNm) {
			this.ccbaCtcdNm = ccbaCtcdNm;
		}

		public String getCcsiName() {
			return ccsiName;
		}

		public void setCcsiName(String ccsiName) {
			this.ccsiName = ccsiName;
		}

		public String getCcbaLcad() {
			return ccbaLcad;
		}

		public void setCcbaLcad(String ccbaLcad) {
			this.ccbaLcad = ccbaLcad;
		}

		public String getCcceName() {
			return ccceName;
		}

		public void setCcceName(String ccceName) {
			this.ccceName = ccceName;
		}

		public String getCcbaPoss() {
			return ccbaPoss;
		}

		public void setCcbaPoss(String ccbaPoss) {
			this.ccbaPoss = ccbaPoss;
		}

		public String getCcbaAdmin() {
			return ccbaAdmin;
		}

		public void setCcbaAdmin(String ccbaAdmin) {
			this.ccbaAdmin = ccbaAdmin;
		}

		public String getCcbaCncl() {
			return ccbaCncl;
		}

		public void setCcbaCncl(String ccbaCncl) {
			this.ccbaCncl = ccbaCncl;
		}

		public String getCcbaCndt() {
			return ccbaCndt;
		}

		public void setCcbaCndt(String ccbaCndt) {
			this.ccbaCndt = ccbaCndt;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		

	}

}

package kosta1200.todayroom.dto;

import java.io.Serializable;

/**
 * ��ǰ���� �� Ŭ����.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class ProductInquiry implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ��ǰ���ǹ�ȣ. */
	private Integer piSeq;

	/** ��������. */
	private String piType;

	/** ���ǳ���. */
	private String piContent;

	/** �亯����. */
	private String piAnswer;

	/**
	 * ������.
	 */
	public ProductInquiry() {
	}
	

	public ProductInquiry(Integer piSeq, String piType, String piContent, String piAnswer) {
		super();
		this.piSeq = piSeq;
		this.piType = piType;
		this.piContent = piContent;
		this.piAnswer = piAnswer;
	}


	/**
	 * ��ǰ���ǹ�ȣ�� �����մϴ�..
	 * 
	 * @param piSeq
	 *            ��ǰ���ǹ�ȣ
	 */
	public void setPiSeq(Integer piSeq) {
		this.piSeq = piSeq;
	}

	/**
	 * ��ǰ���ǹ�ȣ�� �����ɴϴ�..
	 * 
	 * @return ��ǰ���ǹ�ȣ
	 */
	public Integer getPiSeq() {
		return this.piSeq;
	}

	/**
	 * ���������� �����մϴ�..
	 * 
	 * @param piType
	 *            ��������
	 */
	public void setPiType(String piType) {
		this.piType = piType;
	}

	/**
	 * ���������� �����ɴϴ�..
	 * 
	 * @return ��������
	 */
	public String getPiType() {
		return this.piType;
	}

	/**
	 * ���ǳ����� �����մϴ�..
	 * 
	 * @param piContent
	 *            ���ǳ���
	 */
	public void setPiContent(String piContent) {
		this.piContent = piContent;
	}

	/**
	 * ���ǳ����� �����ɴϴ�..
	 * 
	 * @return ���ǳ���
	 */
	public String getPiContent() {
		return this.piContent;
	}

	/**
	 * �亯������ �����մϴ�..
	 * 
	 * @param piAnswer
	 *            �亯����
	 */
	public void setPiAnswer(String piAnswer) {
		this.piAnswer = piAnswer;
	}

	/**
	 * �亯������ �����ɴϴ�..
	 * 
	 * @return �亯����
	 */
	public String getPiAnswer() {
		return this.piAnswer;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((piSeq == null) ? 0 : piSeq.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProductInquiry other = (ProductInquiry) obj;
		if (piSeq == null) {
			if (other.piSeq != null) {
				return false;
			}
		} else if (!piSeq.equals(other.piSeq)) {
			return false;
		}
		return true;
	}

}
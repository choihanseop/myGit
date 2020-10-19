package kosta1200.todayroom.dto;

import java.io.Serializable;

/**
 * ��ǰ �� Ŭ����.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Product implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ��ǰ��ȣ. */
	private Integer productSeq;

	/** ��ǰ��. */
	private String productName;

	/** ����. */
	private Integer productPrice;

	/** ����1. */
	private String productLcategory;

	/** ����2. */
	private String productScategory;

	/** ��ۺ�. */
	private Integer productDlvchr;

	/**
	 * ������.
	 */
	public Product() {
	}
	

	public Product(Integer productSeq, String productName, Integer productPrice, String productLcategory,
			String productScategory, Integer productDlvchr) {
		super();
		this.productSeq = productSeq;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productLcategory = productLcategory;
		this.productScategory = productScategory;
		this.productDlvchr = productDlvchr;
	}


	/**
	 * ��ǰ��ȣ�� �����մϴ�..
	 * 
	 * @param productSeq
	 *            ��ǰ��ȣ
	 */
	public void setProductSeq(Integer productSeq) {
		this.productSeq = productSeq;
	}

	/**
	 * ��ǰ��ȣ�� �����ɴϴ�..
	 * 
	 * @return ��ǰ��ȣ
	 */
	public Integer getProductSeq() {
		return this.productSeq;
	}

	/**
	 * ��ǰ���� �����մϴ�..
	 * 
	 * @param productName
	 *            ��ǰ��
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * ��ǰ���� �����ɴϴ�..
	 * 
	 * @return ��ǰ��
	 */
	public String getProductName() {
		return this.productName;
	}

	/**
	 * ������ �����մϴ�..
	 * 
	 * @param productPrice
	 *            ����
	 */
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * ������ �����ɴϴ�..
	 * 
	 * @return ����
	 */
	public Integer getProductPrice() {
		return this.productPrice;
	}

	/**
	 * ����1�� �����մϴ�..
	 * 
	 * @param productLcategory
	 *            ����1
	 */
	public void setProductLcategory(String productLcategory) {
		this.productLcategory = productLcategory;
	}

	/**
	 * ����1�� �����ɴϴ�..
	 * 
	 * @return ����1
	 */
	public String getProductLcategory() {
		return this.productLcategory;
	}

	/**
	 * ����2�� �����մϴ�..
	 * 
	 * @param productScategory
	 *            ����2
	 */
	public void setProductScategory(String productScategory) {
		this.productScategory = productScategory;
	}

	/**
	 * ����2�� �����ɴϴ�..
	 * 
	 * @return ����2
	 */
	public String getProductScategory() {
		return this.productScategory;
	}

	/**
	 * ��ۺ��� �����մϴ�..
	 * 
	 * @param productDlvchr
	 *            ��ۺ�
	 */
	public void setProductDlvchr(Integer productDlvchr) {
		this.productDlvchr = productDlvchr;
	}

	/**
	 * ��ۺ��� �����ɴϴ�..
	 * 
	 * @return ��ۺ�
	 */
	public Integer getProductDlvchr() {
		return this.productDlvchr;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productSeq == null) ? 0 : productSeq.hashCode());
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
		Product other = (Product) obj;
		if (productSeq == null) {
			if (other.productSeq != null) {
				return false;
			}
		} else if (!productSeq.equals(other.productSeq)) {
			return false;
		}
		return true;
	}

}
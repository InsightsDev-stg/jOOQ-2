/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 implements org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_64_69 {

	private static final long serialVersionUID = -1744576464;

	private java.math.BigDecimal id;
	private java.math.BigDecimal unusedId;

	@Override
	public java.math.BigDecimal getId() {
		return this.id;
	}

	@Override
	public void setId(java.math.BigDecimal id) {
		this.id = id;
	}

	@Override
	public java.math.BigDecimal getUnusedId() {
		return this.unusedId;
	}

	@Override
	public void setUnusedId(java.math.BigDecimal unusedId) {
		this.unusedId = unusedId;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_64_69 from) {
		setId(from.getId());
		setUnusedId(from.getUnusedId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_64_69> E into(E into) {
		into.from(this);
		return into;
	}
}
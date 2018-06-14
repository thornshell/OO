package net.bittreasury.entity;
// Generated 2018-6-13 22:16:01 by Hibernate Tools 5.2.8.Final

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Match generated by hbm2java
 */
@Entity(name = "oo_match")
public class Match implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mId;

	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
	private Team team_a;
	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
	private Team team_b;

	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = true)
	private Team winner;
	@Column
	private String scores;
	@Column
	private Date m_date;
	@Column
	private String address;

	/**
	 * @return the mId
	 */
	public Integer getmId() {
		return mId;
	}

	/**
	 * @param mId
	 *            the mId to set
	 */
	public void setmId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * @return the team_a
	 */
	public Team getTeam_a() {
		return team_a;
	}

	/**
	 * @param team_a
	 *            the team_a to set
	 */
	public void setTeam_a(Team team_a) {
		this.team_a = team_a;
	}

	/**
	 * @return the team_b
	 */
	public Team getTeam_b() {
		return team_b;
	}

	/**
	 * @param team_b
	 *            the team_b to set
	 */
	public void setTeam_b(Team team_b) {
		this.team_b = team_b;
	}

	/**
	 * @return the winner
	 */
	public Team getWinner() {
		return winner;
	}

	/**
	 * @param winner
	 *            the winner to set
	 */
	public void setWinner(Team winner) {
		this.winner = winner;
	}

	/**
	 * @return the scores
	 */
	public String getScores() {
		return scores;
	}

	/**
	 * @param scores
	 *            the scores to set
	 */
	public void setScores(String scores) {
		this.scores = scores;
	}

	/**
	 * @return the m_date
	 */
	public Date getM_date() {
		return m_date;
	}

	/**
	 * @param m_date
	 *            the m_date to set
	 */
	public void setM_date(Date m_date) {
		this.m_date = m_date;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}

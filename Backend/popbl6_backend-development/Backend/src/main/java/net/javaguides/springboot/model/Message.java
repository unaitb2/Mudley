package net.javaguides.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "text")
	private String text;

	@Column(name = "leido")
	private boolean leido;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "userId")
	private User userId;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "chatId")
	private Chat chatId;

	@Column(name = "squedule", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date squedule;

	@Column(name = "proposition")
	private boolean proposition;
	@Column(name = "acepted")
	private String acepted;

	public Message() {

	}

	public Message(String text, Date squedule, User userId, Chat chatId, boolean leido, boolean proposition,
			String acepted) {
		super();
		this.text = text;
		this.squedule = squedule;
		this.userId = userId;
		this.chatId = chatId;
		this.leido = leido;
		this.proposition = proposition;
		this.acepted = acepted;
	}

	/**
	 * @return Long
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return User
	 */
	public User getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Chat getChatId() {
		return chatId;
	}

	public void setChatId(Chat chatId) {
		this.chatId = chatId;
	}

	/**
	 * @return Date
	 */
	public Date getSquedule() {
		return squedule;
	}

	/**
	 * @param squedule
	 */
	public void setSquedule(Date squedule) {
		this.squedule = squedule;
	}

	public boolean isLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public boolean isProposition() {
		return proposition;
	}

	public void setProposition(boolean proposition) {
		this.proposition = proposition;
	}

	public String getAcepted() {
		return acepted;
	}

	public void setAcepted(String acepted) {
		this.acepted = acepted;
	}

}

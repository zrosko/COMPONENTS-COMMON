package hr.adriacomsoftware.app.common.naplata.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;

public class NaplataVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	/* </ Attribute names */
	// XFiles
	public static String XFILES__STATUS = "status";
	public static String XFILES__FILEID = "fileid";
	public static String XFILES__FILETYPEID = "filetypeid";
	public static String XFILES__CONTACTID = "contactid";
	public static String XFILES__STRANKASTATUSID = "strankastatusid";
	public static String XFILES__NAZIV = "naziv";
	public static String XFILES__NASZNAK = "nasznak";
	public static String XFILES__SUDID = "sudid";
	public static String XFILES__UPRAVNOTIJELO = "upravnotijelo";
	public static String XFILES__POSLBR = "poslbr";
	public static String XFILES__RADI = "radi";
	public static String XFILES__VPS = "vps";
	public static String XFILES__KAZNA = "kazna";
	public static String XFILES__DATUMTUZBE = "datumtuzbe";
	public static String XFILES__DATUMOTVOREN = "datumotvoren";
	public static String XFILES__DATUMZATVOREN = "datumzatvoren";
	public static String XFILES__PRIORITY = "priority";
	public static String XFILES__BILLING = "billing";
	public static String XFILES__BILLINGINFO = "billinginfo";
	public static String XFILES__BILLINGSTATUS = "billingstatus";
	public static String XFILES__PRISTOJBE = "pristojbe";
	public static String XFILES__FILESUMMARY = "filesummary";
	public static String XFILES__NOTES = "notes";
	public static String XFILES__STATUSREPORT = "statusreport";
	public static String XFILES__SUPERUSERID = "superuserid";
	public static String XFILES__USERID = "userid";
	public static String XFILES__PRIVATE = "private";
	public static String XFILES__ACTIVE = "active";
	public static String XFILES__DELETED = "deleted";
	public static String XFILES__RESERVED01 = "reserved01";
	public static String XFILES__RESERVED02 = "reserved02";
	public static String XFILES__RESERVED03 = "reserved03";
	public static String XFILES__CREATEDBY = "createdby";
	public static String XFILES__CREATEDDATE = "createddate";
	public static String XFILES__MODIFIEDBY = "modifiedby";
	public static String XFILES__MODIFIEDDATE = "modifieddate";
	public static String XFILES__WHEREISIT = "whereisit";
	public static String XFILES__DATUMKALENDAR = "datumkalendar";
	public static String XFILES__NJIHOVZNAK = "njihovznak";
	public static String XFILES__USERGROUPID = "usergroupid";
	public static String XFILES__DOSUDJENO = "dosudjeno";
	public static String XFILES__RAZLOGKALENDAR = "razlogkalendar";
	// XFileNotes
	public static String XFILENOTES__FILENOTEID = "filenoteid";
	public static String XFILENOTES__NOTEDATE = "notedate";
	public static String XFILENOTES__NOTETIME = "notetime";
	// public static String XFILENOTES__NOTES = "notes";
	public static String XFILENOTES__NOTETYPE = "notetype";
	public static String XFILENOTES__REFTABLE = "reftable";
	public static String XFILENOTES__REFPRIMKEYID = "refprimkeyid";
	public static String XFILENOTES__DATUM_BILJESKE = "datum_biljeske";
	public static String XFILENOTES__VRIJEME_BILJESKE = "vrijeme_biljeske";
	// Xcontacts
	public static String XCONTACTS__STRANKA = "stranka";

	/* Attributes names /> */
	/* </ Constructors */
	public NaplataVo() {
		super();
	}

	public NaplataVo(AS2Record value) {
		super(value);
	}

	// XFiles
	public String getStatus() {
		return get(XFILES__STATUS);
	}

	public String getStranka() {
		return get(XCONTACTS__STRANKA);
	}

	public String getFileID() {
		return getAsStringOrEmpty(XFILES__FILEID);
	}

	public String getFileTypeID() {
		return getAsStringOrEmpty(XFILES__FILETYPEID);
	}

	public String getContactID() {
		return getAsStringOrEmpty(XFILES__CONTACTID);
	}

	public String getStrankaStatusID() {
		return getAsStringOrEmpty(XFILES__STRANKASTATUSID);
	}

	public String getNaziv() {
		return getAsStringOrEmpty(XFILES__NAZIV);
	}

	public String getNasZnak() {
		return getAsStringOrEmpty(XFILES__NASZNAK);
	}

	public String getSudID() {
		return getAsStringOrEmpty(XFILES__SUDID);
	}

	public String getUpravnoTijelo() {
		return getAsStringOrEmpty(XFILES__UPRAVNOTIJELO);
	}

	public String getPoslBr() {
		return getAsStringOrEmpty(XFILES__POSLBR);
	}

	public String getRadi() {
		return getAsStringOrEmpty(XFILES__RADI);
	}

	public String getVPS() {
		return getAsStringOrEmpty(XFILES__VPS);
	}

	public String getKazna() {
		return getAsStringOrEmpty(XFILES__KAZNA);
	}

	public Calendar getDatumTuzbe() {
		return getAsCalendar(XFILES__DATUMTUZBE);
	}

	public Calendar getDatumOtvoren() {
		return getAsCalendar(XFILES__DATUMOTVOREN);
	}

	public Calendar getDatumZatvoren() {
		return getAsCalendar(XFILES__DATUMZATVOREN);
	}

	public String getPriority() {
		return getAsStringOrEmpty(XFILES__PRIORITY);
	}

	public String getBilling() {
		return getAsStringOrEmpty(XFILES__BILLING);
	}

	public String getBillingInfo() {
		return getAsStringOrEmpty(XFILES__BILLINGINFO);
	}

	public String getBillingStatus() {
		return getAsStringOrEmpty(XFILES__BILLINGSTATUS);
	}

	public String getPristojbe() {
		return getAsStringOrEmpty(XFILES__PRISTOJBE);
	}

	public String getFileSummary() {
		return getAsStringOrEmpty(XFILES__FILESUMMARY);
	}

	public String getNotes() {
		return getAsStringOrEmpty(XFILES__NOTES);
	}

	public String getStatusReport() {
		return getAsStringOrEmpty(XFILES__STATUSREPORT);
	}

	public String getSuperUserID() {
		return getAsStringOrEmpty(XFILES__SUPERUSERID);
	}

	public String getUserID() {
		return getAsStringOrEmpty(XFILES__USERID);
	}

	public String getPrivate() {
		return getAsStringOrEmpty(XFILES__PRIVATE);
	}

	public String getActive() {
		return getAsStringOrEmpty(XFILES__ACTIVE);
	}

	public String getDeleted() {
		return getAsStringOrEmpty(XFILES__DELETED);
	}

	public String getReserved01() {
		return getAsStringOrEmpty(XFILES__RESERVED01);
	}

	public String getReserved02() {
		return getAsStringOrEmpty(XFILES__RESERVED02);
	}

	public String getReserved03() {
		return getAsStringOrEmpty(XFILES__RESERVED03);
	}

	public String getCreatedBy() {
		return getAsStringOrEmpty(XFILES__CREATEDBY);
	}

	public Calendar getCreatedDate() {
		return getAsCalendar(XFILES__CREATEDDATE);
	}

	public String getModifiedBy() {
		return getAsStringOrEmpty(XFILES__MODIFIEDBY);
	}

	public Calendar getModifiedDate() {
		return getAsCalendar(XFILES__MODIFIEDDATE);
	}

	public String getWhereIsIt() {
		return getAsStringOrEmpty(XFILES__WHEREISIT);
	}

	public String getDatumKalendar() {
		return getAsStringOrEmpty(XFILES__DATUMKALENDAR);
	}

	public String getNjihovZnak() {
		return getAsStringOrEmpty(XFILES__NJIHOVZNAK);
	}

	public String getUserGroupID() {
		return getAsStringOrEmpty(XFILES__USERGROUPID);
	}

	public String getDosudjeno() {
		return getAsStringOrEmpty(XFILES__DOSUDJENO);
	}

	public String getRazlogKalendar() {
		return getAsStringOrEmpty(XFILES__RAZLOGKALENDAR);
	}

	public void setFileID(String value) {
		set(XFILES__FILEID, value);
	}

	public void setFileTypeID(String value) {
		set(XFILES__FILETYPEID, value);
	}

	public void setContactID(String value) {
		set(XFILES__CONTACTID, value);
	}

	public void setStrankaStatusID(String value) {
		set(XFILES__STRANKASTATUSID, value);
	}

	public void setNaziv(String value) {
		set(XFILES__NAZIV, value);
	}

	public void setNasZnak(String value) {
		set(XFILES__NASZNAK, value);
	}

	public void setSudID(String value) {
		set(XFILES__SUDID, value);
	}

	public void setUpravnoTijelo(String value) {
		set(XFILES__UPRAVNOTIJELO, value);
	}

	public void setPoslBr(String value) {
		set(XFILES__POSLBR, value);
	}

	public void setRadi(String value) {
		set(XFILES__RADI, value);
	}

	public void setVPS(String value) {
		set(XFILES__VPS, value);
	}

	public void setKazna(String value) {
		set(XFILES__KAZNA, value);
	}

	public void setDatumTuzbe(Calendar value) {
		setCalendarAsDateString(value, XFILES__DATUMTUZBE);
	}

	public void setDatumOtvoren(Calendar value) {
		setCalendarAsDateString(value, XFILES__DATUMOTVOREN);
	}

	public void setDatumZatvoren(Calendar value) {
		setCalendarAsDateString(value, XFILES__DATUMZATVOREN);
	}

	public void setPriority(String value) {
		set(XFILES__PRIORITY, value);
	}

	public void setBilling(String value) {
		set(XFILES__BILLING, value);
	}

	public void setBillingInfo(String value) {
		set(XFILES__BILLINGINFO, value);
	}

	public void setBillingStatus(String value) {
		set(XFILES__BILLINGSTATUS, value);
	}

	public void setPristojbe(String value) {
		set(XFILES__PRISTOJBE, value);
	}

	public void setFileSummary(String value) {
		set(XFILES__FILESUMMARY, value);
	}

	public void setNotes(String value) {
		set(XFILES__NOTES, value);
	}

	public void setStatusReport(String value) {
		set(XFILES__STATUSREPORT, value);
	}

	public void setSuperUserID(String value) {
		set(XFILES__SUPERUSERID, value);
	}

	public void setUserID(String value) {
		set(XFILES__USERID, value);
	}

	public void setPrivate(String value) {
		set(XFILES__PRIVATE, value);
	}

	public void setActive(String value) {
		set(XFILES__ACTIVE, value);
	}

	public void setDeleted(String value) {
		set(XFILES__DELETED, value);
	}

	public void setReserved01(String value) {
		set(XFILES__RESERVED01, value);
	}

	public void setReserved02(String value) {
		set(XFILES__RESERVED02, value);
	}

	public void setReserved03(String value) {
		set(XFILES__RESERVED03, value);
	}

	public void setCreatedBy(String value) {
		set(XFILES__CREATEDBY, value);
	}

	public void setCreatedDate(Calendar value) {
		setCalendarAsDateString(value, XFILES__CREATEDDATE);
	}

	public void setModifiedBy(String value) {
		set(XFILES__MODIFIEDBY, value);
	}

	public void setModifiedDate(Calendar value) {
		setCalendarAsDateString(value, XFILES__MODIFIEDDATE);
	}

	public void setWhereIsIt(String value) {
		set(XFILES__WHEREISIT, value);
	}

	public void setDatumKalendar(String value) {
		set(XFILES__DATUMKALENDAR, value);
	}

	public void setNjihovZnak(String value) {
		set(XFILES__NJIHOVZNAK, value);
	}

	public void setUserGroupID(String value) {
		set(XFILES__USERGROUPID, value);
	}

	public void setDosudjeno(String value) {
		set(XFILES__DOSUDJENO, value);
	}

	public void setRazlogKalendar(String value) {
		set(XFILES__RAZLOGKALENDAR, value);
	}

	// XFileNotes
	public String getFileNoteID() {
		return getAsStringOrEmpty(XFILENOTES__FILENOTEID);
	}

	public String getNoteDate() {
		return getAsStringOrEmpty(XFILENOTES__NOTEDATE);
	}

	public String getNoteTime() {
		return getAsStringOrEmpty(XFILENOTES__NOTETIME);
	}

	// public String getNotes() {
	// return getAsStringOrEmpty(XFILENOTES__NOTES);
	// }
	public String getNoteType() {
		return getAsStringOrEmpty(XFILENOTES__NOTETYPE);
	}

	public String getRefTable() {
		return getAsStringOrEmpty(XFILENOTES__REFTABLE);
	}

	public String getRefPrimKeyID() {
		return getAsStringOrEmpty(XFILENOTES__REFPRIMKEYID);
	}

	public Calendar getDatumBiljeske() {
		return getAsCalendar(XFILES__CREATEDDATE);
	}

	public Calendar getVrijemeBiljeske() {
		return getAsCalendar(XFILES__CREATEDDATE);
	}

	public void setFileNoteID(String value) {
		set(XFILENOTES__FILENOTEID, value);
	}

	public void setNoteDate(String value) {
		set(XFILENOTES__NOTEDATE, value);
	}

	public void setNoteTime(String value) {
		set(XFILENOTES__NOTETIME, value);
	}

	// public void setNotes(String value) {
	// set(XFILENOTES__NOTES, value);
	// }
	public void setNoteType(String value) {
		set(XFILENOTES__NOTETYPE, value);
	}

	public void setRefTable(String value) {
		set(XFILENOTES__REFTABLE, value);
	}

	public void setRefPrimKeyID(String value) {
		set(XFILENOTES__REFPRIMKEYID, value);
	}

	public void setDatumBiljeske(Calendar value) {
		setCalendarAsDateString(value, XFILES__CREATEDDATE);
	}

	public void setVrijemeBiljeske(Calendar value) {
		concatinateTimeToExistingDate(value, XFILES__CREATEDDATE);
	}

	public void setStranka(String value) {
		set(XCONTACTS__STRANKA, value);
	}

	public void setStatus(String value) {
		set(XFILES__STATUS, value);
	}
}
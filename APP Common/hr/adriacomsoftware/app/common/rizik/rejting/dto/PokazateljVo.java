package hr.adriacomsoftware.app.common.rizik.rejting.dto;

import hr.adriacomsoftware.app.common.jb.dto.OsnovniVo;
import hr.as2.inf.common.data.AS2Record;

import java.util.Calendar;
import java.util.StringTokenizer;

public class PokazateljVo extends OsnovniVo {
	private static final long serialVersionUID = 1L;
	public static String KR_POKAZATELJ__POKAZATELJ = "pokazatelj";
	public static String KR_POKAZATELJ__VRSTA = "vrsta";
	public static String KR_POKAZATELJ__NAZIV = "naziv";
	public static String KR_POKAZATELJ__PONDER = "ponder";
	public static String KR_POKAZATELJ__PONDER_NOVI_KLIJENT = "ponder_novi_klijent";
	public static String KR_POKAZATELJ__PONDER_NOVO_DRUSTVO = "ponder_novo_drustvo";
	public static String KR_POKAZATELJ__PONDER_PRORACUN = "ponder_proracun";
	public static String KR_POKAZATELJ__PONDER_DOHODAK = "ponder_dohodak";
	public static String KR_POKAZATELJ__VRIJEDI_OD = "vrijedi_od";
	public static String KR_POKAZATELJ__VRIJEDI_DO = "vrijedi_do";
	public static String KR_POKAZATELJ__ISPRAVNO = "ispravno";
	// dodatak
	public static String KR_POKAZATELJ__TIP_ENTITETA = "tip_entiteta";
	public static String KR_POKAZATELJ__APLIKACIJA = "aplikacija";
	public static String KR_POKAZATELJ__GODINA = "godina";
	// vrsta
	public static String KR_POKAZATELJ__NAZIV_VRSTE = "naziv_vrste";
	public static String KR_POKAZATELJ__PONDER_VRSTE = "ponder_vrste";
	public static String KR_POKAZATELJ__PONDER_VRSTE_NOVI_KLIJENT = "ponder_vrste_novi_klijent";
	public static String KR_POKAZATELJ__PONDER_VRSTE_NOVO_DRUSTVO = "ponder_vrste_novo_drustvo";
	public static String KR_POKAZATELJ__PONDER_VRSTE_PRORACUN = "ponder_vrste_proracun";
	public static String KR_POKAZATELJ__PONDER_VRSTE_DOHODAK = "ponder_vrste_dohodak";
	// ocjena
	public static String KR_POKAZATELJ__OCJENA = "ocjena";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD = "vrijednost_od";
	public static String KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO = "vrijednost_do";

	public PokazateljVo() {
		super();
	}

	public PokazateljVo(AS2Record value) {
		super(value);
	}

	public PokazateljRs pripremiTipovePokazatelja() {
		PokazateljRs rs = new PokazateljRs();
		StringTokenizer st = new StringTokenizer(getTipEntiteta(), ",");
		String token;
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			PokazateljVo vo = new PokazateljVo();
			vo.setTipEntiteta(token);
			vo.setAplikacija(getAplikacija());
			vo.setPokazatelj(getPokazatelj());
			vo.setPonder(getPonder());
			vo.setPonderNoviKlijent(getPonderNoviKlijent());
			vo.setPonderNovoDrustvo(getPonderNovoDrustvo());
			vo.setPonderProracun(getPonderProracun());
			vo.setPonderDohodak(getPonderDohodak());
			vo.setVrsta(getVrsta());
			vo.setNaziv(getNaziv());
			vo.setVrijediOd(getVrijediOd());
			vo.setVrijediDo(getVrijediDo());
			rs.addRow(vo);
		}
		return rs;
	}

	public String getPokazatelj() {
		return getAsString(KR_POKAZATELJ__POKAZATELJ);
	}

	public String getVrsta() {
		return getAsString(KR_POKAZATELJ__VRSTA);
	}

	public String getNaziv() {
		return getAsString(KR_POKAZATELJ__NAZIV);
	}

	public String getPonder() {
		return getAsString(KR_POKAZATELJ__PONDER);
	}

	public String getPonderNoviKlijent() {
		return getAsString(KR_POKAZATELJ__PONDER_NOVI_KLIJENT);
	}

	public String getPonderNovoDrustvo() {
		return getAsString(KR_POKAZATELJ__PONDER_NOVO_DRUSTVO);
	}

	public String getPonderProracun() {
		return getAsString(KR_POKAZATELJ__PONDER_PRORACUN);
	}

	public String getPonderDohodak() {
		return getAsString(KR_POKAZATELJ__PONDER_DOHODAK);
	}

	public Calendar getVrijediOd() {
		return getAsCalendar(KR_POKAZATELJ__VRIJEDI_OD);
	}

	public Calendar getVrijediDo() {
		return getAsCalendar(KR_POKAZATELJ__VRIJEDI_DO);
	}

	public String getIspravno() {
		return getAsString(KR_POKAZATELJ__ISPRAVNO);
	}

	public String getTipEntiteta() {
		return getAsString(KR_POKAZATELJ__TIP_ENTITETA);
	}

	public String getAplikacija() {
		return getAsString(KR_POKAZATELJ__APLIKACIJA);
	}

	public String getGodina() {
		return getAsString(KR_POKAZATELJ__GODINA);
	}

	// vrsta
	public String getNazivVrste() {
		return getAsString(KR_POKAZATELJ__NAZIV_VRSTE);
	}

	public String getPonderVrste() {
		return getAsString(KR_POKAZATELJ__PONDER_VRSTE);
	}

	public String getPonderVrsteNoviKlijent() {
		return getAsString(KR_POKAZATELJ__PONDER_VRSTE_NOVI_KLIJENT);
	}

	public String getPonderVrsteNovoDrustvo() {
		return getAsString(KR_POKAZATELJ__PONDER_VRSTE_NOVO_DRUSTVO);
	}

	public String getPonderVrsteProracun() {
		return getAsString(KR_POKAZATELJ__PONDER_VRSTE_PRORACUN);
	}

	public String getPonderVrsteDohodak() {
		return getAsString(KR_POKAZATELJ__PONDER_VRSTE_DOHODAK);
	}

	// ocjena
	public String getOcjena() {
		return getAsString(KR_POKAZATELJ__OCJENA);
	}

	public String getVrijednostOd() {
		return getAsString(KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD);
	}

	public String getVrijednostDo() {
		return getAsString(KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO);
	}

	// setteri
	public void setPokazatelj(String value) {
		set(KR_POKAZATELJ__POKAZATELJ, value);
	}

	public void setVrsta(String value) {
		set(KR_POKAZATELJ__VRSTA, value);
	}

	public void setNaziv(String value) {
		set(KR_POKAZATELJ__NAZIV, value);
	}

	public void setPonder(String value) {
		set(KR_POKAZATELJ__PONDER, value);
	}

	public void setPonderNoviKlijent(String value) {
		set(KR_POKAZATELJ__PONDER_NOVI_KLIJENT, value);
	}

	public void setPonderNovoDrustvo(String value) {
		set(KR_POKAZATELJ__PONDER_NOVO_DRUSTVO, value);
	}

	public void setPonderProracun(String value) {
		set(KR_POKAZATELJ__PONDER_PRORACUN, value);
	}

	public void setPonderDohodak(String value) {
		set(KR_POKAZATELJ__PONDER_DOHODAK, value);
	}

	public void setVrijediOd(Calendar value) {
		setCalendarAsDateString(value, KR_POKAZATELJ__VRIJEDI_OD);
	}

	public void setVrijediDo(Calendar value) {
		setCalendarAsDateString(value, KR_POKAZATELJ__VRIJEDI_DO);
	}

	public void setIspravno(String value) {
		set(KR_POKAZATELJ__ISPRAVNO, value);
	}

	public void setTipEntiteta(String value) {
		set(KR_POKAZATELJ__TIP_ENTITETA, value);
	}

	public void setAplikacija(String value) {
		set(KR_POKAZATELJ__APLIKACIJA, value);
	}

	public void setGodina(String value) {
		set(KR_POKAZATELJ__GODINA, value);
	}

	// vrsta
	public void setNazivVrste(String value) {
		set(KR_POKAZATELJ__NAZIV_VRSTE, value);
	}

	public void setPonderVrste(String value) {
		set(KR_POKAZATELJ__PONDER_VRSTE, value);
	}

	public void setPonderVrsteNoviKlijent(String value) {
		set(KR_POKAZATELJ__PONDER_VRSTE_NOVI_KLIJENT, value);
	}

	public void setPonderVrsteNovoDrustvo(String value) {
		set(KR_POKAZATELJ__PONDER_VRSTE_NOVO_DRUSTVO, value);
	}

	public void setPonderVrsteProracun(String value) {
		set(KR_POKAZATELJ__PONDER_VRSTE_PRORACUN, value);
	}

	public void setPonderVrsteDohodak(String value) {
		set(KR_POKAZATELJ__PONDER_VRSTE_DOHODAK, value);
	}

	// ocjena
	public void setOcjena(String value) {
		set(KR_POKAZATELJ__OCJENA, value);
	}

	public void setVrijednostOd(String value) {
		set(KR_POKAZATELJ_OCJENA__VRIJEDNOST_OD, value);
	}

	public void setVrijednostDo(String value) {
		set(KR_POKAZATELJ_OCJENA__VRIJEDNOST_DO, value);
	}
}
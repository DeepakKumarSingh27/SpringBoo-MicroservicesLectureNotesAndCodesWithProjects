package in.ashokit.binding;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Data
@Schema(description = "Ticket Details")
public class TicketInfo {

	@Schema(description = "Ticket ID", example = "1234")
	private Integer ticketId;

	@Schema(description = "PNR Number", example = "JLJL6868")
	private String pnr;

	@Schema(description = "Ticket Status", example = "Confirmed")
	private String ticketStatus;

	// getters & setters
}

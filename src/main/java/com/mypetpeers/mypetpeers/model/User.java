

@Data
@Entity
public class User{
	
	@Id
	private int UserId;
	@NotNull
	private  String UserName;
	@NotNull
	private  String UserPassword;
}

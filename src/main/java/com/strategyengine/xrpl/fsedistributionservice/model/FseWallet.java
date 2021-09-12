package com.strategyengine.xrpl.fsedistributionservice.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ApiModel(value="POST parameters to send tokens to one or more recipients")
public class FseWallet {

	@ApiModelProperty(value="XRP address from wallet that is sending the token.  Example rnL2P..", required=true )
	@NonNull
	private String fromClassicAddress;

	@ApiModelProperty(value="XRP public signing address from wallet that is sending the token.  Example ED92AA5B7BBCE...", required=true)
	@NonNull	
	private String fromSigningPublicKey;

	@ApiModelProperty(value="XRP private key from wallet that is sending the token.  Example ED419C91A68F5...", required=true)	
	@NonNull
	private String fromPrivateKey;

	@ApiModelProperty(value="This value is not used by the API but could be used to import into other wallets", required=true)	
	@NonNull
	private String userSeed;

	@ApiModelProperty(value="True if wallet is for the test network", required=true)	
	@NonNull
	private Boolean isTest;
	

}

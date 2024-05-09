package PratikInsuranceManagement.ClaimInsuranceManagement.Service;

import PratikInsuranceManagement.ClaimInsuranceManagement.DTO.ClaimDto;
import PratikInsuranceManagement.ClaimInsuranceManagement.DTO.ClaimResponse.ClaimResponseDto;
import PratikInsuranceManagement.ClaimInsuranceManagement.DTO.ClaimUpdatedReqDto;

import java.util.List;

public interface ClaimService {
    public abstract String addClaim(ClaimDto claimDto) throws Exception;

    public abstract ClaimResponseDto getClaimById(Integer id) throws Exception;

    public abstract List<ClaimResponseDto> getAllClaims() throws Exception;

    public abstract String deleteClaim(Integer id) throws Exception;

    public abstract String updateClaim(Integer id, ClaimUpdatedReqDto claimUpdateReqDto) throws Exception;
}

package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;
import in.ashokit.repo.AccountRepository;

@Service
public class AccountService {

    private AccountRepository accRepo;

    public AccountService(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }

    public void getDataUsingPK() {
        AccountPk pk = new AccountPk();
        pk.setAccId(101);
        pk.setAcctype("SAVINGS");   // FIXED
        pk.setHolderName("TCS");

        accRepo.findById(pk).ifPresentOrElse(
            acc -> System.out.println(acc),
            () -> System.out.println("Account not found")
        );
    }

    public void saveAccData() {
        AccountPk pk = new AccountPk();
        pk.setAccId(101);
        pk.setAcctype("SAVINGS");   // FIXED
        pk.setHolderName("TCS");

        Account acc = new Account();
        acc.setBranchName("Ameerpet");
        acc.setMinBal(5000.00);
        acc.setAccPk(pk);

        accRepo.save(acc);
        System.out.println("Account saved successfully");
    }
}
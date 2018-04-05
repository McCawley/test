package hu.training.duplicate.again;

import java.io.Serializable;

public class DuplicateAgain extends PackagePrivate {
	protected PackagePrivate packagePrivate;
	protected PackagePrivate packagePrivate2;
	
	public PackagePrivate getPackagePrivate() {
		return packagePrivate;
	}

	public void setPackagePrivate(PackagePrivate packagePrivate) {
		this.packagePrivate = packagePrivate;
	}

	public PackagePrivate getPackagePrivate2() {
		return packagePrivate2;
	}

	public void setPackagePrivate2(PackagePrivate packagePrivate2) {
		this.packagePrivate2 = packagePrivate2;
	}

	public static void staticImport() {
		System.out.println("Static import");
		PackagePrivate foo = new PackagePrivate();
	}
	
}

package chapter2.item2;

import java.util.Objects;

/**
 *
 * @date 2019年1月25日 上午11:22:57
 * @author 50689
**/
public class NyPizza extends Pizza {
	
	public enum Size {SMALL, MEDIUM, LARGE}
	public static class Builder extends Pizza.Builder<Builder> {
		
		public Builder(Size size) {
			Objects.requireNonNull(size);
		}

		@Override
		Pizza build() {
			return new NyPizza(this);
		}

		@Override
		protected Builder self() {
			return this;
		}
		
	}

	private NyPizza(Builder builder) {
		super(builder);
	}

}

		
public class LongSword {
	

	
		private LongSwordHilt longSwordHilt;
		private LongSwordBlade longSwordBlade;
		private final LongSwordScabbard longSwordScabbard;
	

		private LongSword() throws Exception {
	
			this.setLongSwordHilt(null);
			this.longSwordBlade = null;
			this.longSwordScabbard = null;
		}
	

		LongSword(LongSwordHilt longSwordHilt, LongSwordBlade longSwordBlade, LongSwordScabbard longSwordScabbard) throws Exception {
	
			this.setLongSwordHilt(longSwordHilt);
			this.setLongSwordBlade(longSwordBlade);
			this.longSwordScabbard = longSwordScabbard;
		}
	

	
		public LongSwordHilt getLongSwordHilt(){	return this.longSwordHilt; }
		public LongSwordBlade getLongSwordBlade(){ return this.longSwordBlade; }
		public LongSwordScabbard getLongSwordScabbard(){ return this.longSwordScabbard; }
	

		public LongSword setLongSwordHilt(LongSwordHilt longSwordHilt) throws Exception {
			if(longSwordHilt == null) throw new Exception("LongSwordHilt cannot be null");
			this.longSwordHilt = longSwordHilt;
			return this;
		}
	

		public LongSword setLongSwordBlade(LongSwordBlade longSwordBlade){
			this.longSwordBlade = longSwordBlade;
			return this;
		}
	}

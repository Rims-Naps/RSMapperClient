package jaclib.peer;

public class IUnknown extends Peer {
   public final native long AddRef();

   protected IUnknown(ti var_ti) {
      this.reference = new IUnknownReference(this, var_ti);
   }

   public final long a(int i) {
      return super.a();
   }
}

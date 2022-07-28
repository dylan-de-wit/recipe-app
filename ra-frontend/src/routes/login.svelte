<script>
    import AppHeader from '../lib/AppHeader.svelte'
    import InputField from '../lib/form/InputField.svelte'
    import Button from '../lib/Button.svelte'
</script>

<AppHeader/>
<section class="page login">
    <InputField/>
    <InputField/>
    <Button class="login__button">
        Login
    </Button>
</section>

<style lang="scss">
  @import "../styles/theme";

  .login {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 1rem;
    margin-left: auto;
    margin-right: auto;
    width: fit-content;

    :global(.login__button) {
      align-self: flex-end;
    }
  }
</style>